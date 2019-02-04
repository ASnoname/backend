package ftc.shift.scheduler.controller;

import ftc.shift.scheduler.models.Category;
import ftc.shift.scheduler.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CategoryController {

    private static final String CATEGORY_PATH = Resources.CATEGORY_PREFIX;

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @CrossOrigin
    @GetMapping(CATEGORY_PATH)
    public @ResponseBody
    BaseResponse<Collection<Category>> provideAllCategories() {

        return new BaseResponse<>(categoryService.provideCategories());
    }

    @CrossOrigin
    @PostMapping(CATEGORY_PATH)
    public @ResponseBody
    BaseResponse<Category> createCategory(@RequestBody Category category) {

        return new BaseResponse<>(categoryService.createCategory(category));
    }

    @CrossOrigin
    @DeleteMapping(CATEGORY_PATH + "/{idCategory}")
    public @ResponseBody
    BaseResponse deleteCategory(@PathVariable(name = "idCategory") String idCategory) {

        return new BaseResponse<>(categoryService.deleteCategory(idCategory));
    }

    @CrossOrigin
    @PostMapping(CATEGORY_PATH + "/{idCategory}")
    public @ResponseBody
    BaseResponse<Category> updateCategory(@RequestBody Category category, @PathVariable String idCategory) {

        if (idCategory.equals(category.getIdCategory())){

            return new BaseResponse<>(categoryService.updateCategory(category));
        }
        else {

            return new BaseResponse<>(false);
        }
    }
}