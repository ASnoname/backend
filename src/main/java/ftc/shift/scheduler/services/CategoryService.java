package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Category;

import java.util.Collection;

public interface CategoryService {

    Category provideCategory(String idCategory);

    Category updateCategory(Category category);

    boolean deleteCategory(String idCategory);

    Category createCategory(Category category);

    Collection<Category> provideCategories();
}
