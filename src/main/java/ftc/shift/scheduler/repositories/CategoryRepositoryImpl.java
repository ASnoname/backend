package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Category;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private Map<String, Category> categories;

    public CategoryRepositoryImpl() {

        categories = new HashMap<>();
    }

    @Override
    public Category fetchCategory(String idCategory) {

        return categories.get(idCategory);
    }

    @Override
    public Category updateCategory(Category category) {

        categories.put(category.getIdCategory(), category);

        return category;
    }

    @Override
    public boolean deleteCategory(String idCategory) {

        categories.remove(idCategory);

        return !categories.containsKey(idCategory);
    }

    @Override
    public Category createCategory(Category category) {

        category.setIdCategory(String.valueOf(category.hashCode()));

        categories.put(category.getIdCategory(), category);

        return category;
    }

    @Override
    public Collection<Category> getAllCategories() {

        return categories.values();
    }
}