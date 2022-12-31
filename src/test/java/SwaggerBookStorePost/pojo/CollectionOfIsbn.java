package SwaggerBookStorePost.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionOfIsbn {
    @JsonProperty("isbn")
    public String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "CollectionOfIsbn{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
