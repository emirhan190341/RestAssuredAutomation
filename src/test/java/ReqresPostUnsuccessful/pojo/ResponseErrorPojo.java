package ReqresPostUnsuccessful.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseErrorPojo {

    @JsonProperty("error")
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "PostRegisterUnsuccessfulPojo{" +
                "error='" + error + '\'' +
                '}';
    }
}
