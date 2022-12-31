package SwaggerBookStoreDeleteBooks.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePojo {

    @JsonProperty("userId")
    public String userId;
    @JsonProperty("message")
    public String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "userId='" + userId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
