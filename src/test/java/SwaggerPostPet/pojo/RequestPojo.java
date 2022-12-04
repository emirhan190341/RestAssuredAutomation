package SwaggerPostPet.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RequestPojo {
    @JsonProperty("id")
    public int id;
    @JsonProperty("category")
    public Category category;
    @JsonProperty("name")
    public String name;
    @JsonProperty("photoUrls")
    public ArrayList<String> photoUrls;
    @JsonProperty("tags")
    public ArrayList<Tag> tags;
    @JsonProperty("status")
    public String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }


    public RequestPojo addTags(Tag tag){

        if(tags == null){
            tags = new ArrayList<>();
        }

        tags.add(tag);

        return this;
    }


    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}
