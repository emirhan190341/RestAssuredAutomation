package ReqresGetListUsers.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Support {

    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Support{" +
                "url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
