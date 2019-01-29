package ftc.shift.scheduler.repositories;

import ftc.shift.scheduler.models.Book;

import java.util.Collection;

/**
 * Интерфейс для получения данных по книгам
 */
public interface BookRepository {

    Book fetchBook(String id);

    Book updateBook(Book book);

    void deleteBook(String id);

    Book createBook(Book book);

    Collection<Book> getAllBooks();
}
