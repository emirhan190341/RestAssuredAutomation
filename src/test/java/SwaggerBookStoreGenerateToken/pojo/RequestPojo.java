package SwaggerBookStoreGenerateToken.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestPojo {

    @JsonProperty("userName")
    public String userName;
    @JsonProperty("password")
    public String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
