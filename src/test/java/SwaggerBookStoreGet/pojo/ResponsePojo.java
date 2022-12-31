package SwaggerBookStoreGet.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponsePojo {
    @JsonProperty("userId")
    public String userId;
    @JsonProperty("username")
    public String username;
    @JsonProperty("books")
    public ArrayList<Book> books;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String   toString() {
        return "ResponsePojo{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", books=" + books +
                '}';
    }
}
