package ReqresPutUpdate.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserRequest {


    @JsonProperty("name")
    private String name;

    @JsonProperty("job")
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

