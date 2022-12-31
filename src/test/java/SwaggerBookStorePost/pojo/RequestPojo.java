package SwaggerBookStorePost.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RequestPojo {

    @JsonProperty("userId")
    public String userId;
    @JsonProperty("collectionOfIsbns")
    public ArrayList<CollectionOfIsbn> collectionOfIsbns;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<CollectionOfIsbn> getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(ArrayList<CollectionOfIsbn> collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "userId='" + userId + '\'' +
                ", collectionOfIsbns=" + collectionOfIsbns +
                '}';
    }
}
