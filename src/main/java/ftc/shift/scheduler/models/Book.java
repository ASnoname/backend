package ftc.shift.scheduler.models;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private String id;
    private String name;
    private String author;
    private Integer pages;
    private Boolean isAvailable;
    private List<String> genre;

    public Book() {
    }

    public Book(String id, String name, String author, Integer pages, Boolean isAvailable, List<String> genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isAvailable = isAvailable;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
