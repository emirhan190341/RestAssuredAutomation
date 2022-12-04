package ReqresPostUnsuccessful.pojo;

public class RequestErrorPojo {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RequestRegisterUnsuccessfulPojo{" +
                "email='" + email + '\'' +
                '}';
    }
}
