package ftc.shift.scheduler.api;


import ftc.shift.scheduler.models.Book;
import ftc.shift.scheduler.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BooksController {

    private static final String BOOKS_PATH = "/api/v001/books";

    @Autowired
    private BookService service;

    @GetMapping(BOOKS_PATH + "/{id}")
    public ResponseEntity<Book> readBook(@PathVariable String id) {
        Book book = service.provideBook(id);

        if (null == book) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(book);
        }
    }

    @GetMapping(BOOKS_PATH)
    public ResponseEntity<Collection<Book>> listBooks() {
        Collection<Book> books = service.provideBooks();
        return ResponseEntity.ok(books);
    }

    @PostMapping(BOOKS_PATH)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book result = service.createBook(book);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping(BOOKS_PATH + "/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable String id) {
        service.deleteBook(id);
        return ResponseEntity.ok().build(); //нет тела, только статус
    }

    @PatchMapping(BOOKS_PATH + "/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {
        Book result = service.updateBook(book);
        return ResponseEntity.ok(result);
    }
}