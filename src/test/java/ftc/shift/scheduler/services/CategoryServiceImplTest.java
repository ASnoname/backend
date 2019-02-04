package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Category;
import ftc.shift.scheduler.repositories.CategoryRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class CategoryServiceImplTest {

    @Autowired
    private CategoryService sut;

    private CategoryRepository repository;

    private Category category;

    @Before
    public void setUp() throws Exception {

        repository = mock(CategoryRepository.class);

        sut = new CategoryServiceImpl(repository);

        category = new Category("3634573", "before");
    }

    @Test
    public void provideCategory() {

        Category cat = repository.createCategory(category);

        Category actual = sut.provideCategory(cat.getIdCategory());

        Category expected = repository.fetchCategory(cat.getIdCategory());

        assertEquals(expected, actual);

        when(sut.provideCategory(cat.getIdCategory())).thenReturn(category);

        verify(repository, times(2)).createCategory(category);
    }

    @Test
    public void updateCategory() {

        Category cat = repository.createCategory(category);

        cat.setName("after");

        Category actual = sut.updateCategory(cat);

        Category expected = repository.fetchCategory(cat.getIdCategory());

        assertEquals(actual, expected);
    }

    @Test
    public void deleteCategory() {

        Category cat = repository.createCategory(category);

        assertTrue(sut.deleteCategory(cat.getIdCategory()));

        verify(repository, times(1)).deleteCategory(category.getIdCategory());
    }

    @Test
    public void createCategory() {

        Category actual = sut.createCategory(category);

        Category expected = repository.createCategory(category);

        assertEquals(expected, actual);

        when(repository.createCategory(category)).thenReturn(category);

        verify(repository, times(2)).createCategory(category);
    }

    @Test
    public void provideCategories() {

        Collection<Category> actual = sut.provideCategories();

        Collection<Category> expected = repository.getAllCategories();

        assertEquals(expected, actual);

        when(repository.getAllCategories()).thenReturn(expected);

        verify(repository, times(2)).getAllCategories();
    }
}