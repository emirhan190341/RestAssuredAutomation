package SwaggerBookStoreGenerateToken.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ResponsePojo {
    @JsonProperty("token")
    public String token;
    @JsonProperty("expires")
    public Date expires;
    @JsonProperty("status")
    public String status;
    @JsonProperty("result")
    public String result;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "token='" + token + '\'' +
                ", expires=" + expires +
                ", status='" + status + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
