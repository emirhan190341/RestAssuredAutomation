package ReqresPostSuccessful.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePojo {

    @JsonProperty("token")
    public String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "token='" + token + '\'' +
                '}';
    }
}
