package Interview.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponsePojoText {

    @JsonProperty("status")
    public String status;
    @JsonProperty("code")
    public int code;
    @JsonProperty("total")
    public int total;
    @JsonProperty("data")
    public ArrayList<DatumText> data;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public ArrayList<DatumText> getData() {
        return data;
    }

    public void setData(ArrayList<DatumText> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponsePojoText{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
