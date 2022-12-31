package SwaggerBookStore.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponsePojo {

    @JsonProperty("userID")
    public String userID;
    @JsonProperty("username")
    public String username;
    @JsonProperty("books")
    public ArrayList<Object> books;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Object> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Object> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", books=" + books +
                '}';
    }
}
