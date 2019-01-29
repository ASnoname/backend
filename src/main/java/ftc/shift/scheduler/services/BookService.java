package ftc.shift.scheduler.services;

import ftc.shift.scheduler.models.Book;
import ftc.shift.scheduler.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book provideBook(String id) {
        return bookRepository.fetchBook(id);
    }

    public Book updateBook(Book book) {
        bookRepository.updateBook(book);
        return book;
    }

    public void deleteBook(String id) {
        bookRepository.deleteBook(id);
    }


    public Book createBook(Book book) {
        bookRepository.createBook(book);
        return book;
    }

    public Collection<Book> provideBooks() {
        return bookRepository.getAllBooks();
    }

}
