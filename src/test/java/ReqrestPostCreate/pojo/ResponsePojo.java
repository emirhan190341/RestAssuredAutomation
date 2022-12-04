package ReqrestPostCreate.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ResponsePojo {
    @JsonProperty("name")
    public  String name;
    @JsonProperty("job")
    public String job;
    @JsonProperty("id")
    public  String id;
    @JsonProperty("createdAt")
    public Date createdAt;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
