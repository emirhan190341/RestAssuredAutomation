package SwaggerBookStorePut.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestPojo {
    @JsonProperty("userId")
    public String userId;
    @JsonProperty("isbn")
    public String isbn;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "userId='" + userId + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
