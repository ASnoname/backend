package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Category;

import java.util.Collection;

public interface CategoryService {

    Category provideCategory(String idCategory);

    Category updateCategory(Category category);

    void deleteCategory(String idCategory);

    Category createCategory(Category category);

    Collection<Category> provideCategories();
}
