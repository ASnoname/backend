package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Category;
import ftc.shift.scheduler.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category provideCategory(String idCategory) {

        return categoryRepository.fetchCategory(idCategory);
    }

    @Override
    public Category updateCategory(Category category) {

        return categoryRepository.updateCategory(category);
    }

    @Override
    public void deleteCategory(String idCategory) {

        categoryRepository.deleteCategory(idCategory);
    }

    @Override
    public Category createCategory(Category category) {

        return categoryRepository.createCategory(category);
    }

    @Override
    public Collection<Category> provideCategories() {

        return categoryRepository.getAllCategories();
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }
}