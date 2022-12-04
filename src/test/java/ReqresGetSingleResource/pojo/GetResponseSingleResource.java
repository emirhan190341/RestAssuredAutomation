package ReqresGetSingleResource.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResponseSingleResource {


    @JsonProperty("data")
    Data data;

    @JsonProperty("support")
    Support sup;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSup() {
        return sup;
    }

    public void setSup(Support sup) {
        this.sup = sup;
    }


}
