package SwaggerBookStoreBookGet.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Book {
    @JsonProperty("books")
    public ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Book{" +
                "books=" + books +
                '}';
    }
}
