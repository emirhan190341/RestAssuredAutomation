package SwaggerUserCreateWithArray.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePojo {

    @JsonProperty("code")
    public int code;
    @JsonProperty("type")
    public String type;
    @JsonProperty("message")
    public String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                "code=" + code +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
