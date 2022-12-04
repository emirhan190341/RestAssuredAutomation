package ReqresPostSuccessful.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestPojo {

    @JsonProperty("email")
    public String email;
    @JsonProperty("password")
    public String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
