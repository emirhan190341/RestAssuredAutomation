package ReqresPutUpdate.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class CreateUserResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("updatedAt")
    private Date updatedAt;

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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", updatedAt=" + updatedAt +
                '}';
    }

}
