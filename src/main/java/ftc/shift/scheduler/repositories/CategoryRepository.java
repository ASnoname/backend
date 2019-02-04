package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Category;

import java.util.Collection;

public interface CategoryRepository {

    Category fetchCategory(String idCategory);

    Category updateCategory(Category category);

    boolean deleteCategory(String idCategory);

    Category createCategory(Category category);

    Collection<Category> getAllCategories();
}