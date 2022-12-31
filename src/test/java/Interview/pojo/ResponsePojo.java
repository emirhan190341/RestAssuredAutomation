package Interview.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponsePojo {
    @JsonProperty("status")
    public String status;
    @JsonProperty("code")
    public int code;
    @JsonProperty("total")
    public int total;
    @JsonProperty("datas")
    public ArrayList<Datum> datas;

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

    public ArrayList<Datum> getData() {
        return datas;
    }

    public void setData(ArrayList<Datum> data) {
        this.datas = data;
    }

    @Override
    public String toString() {
        return "ResponsePojo{" +
                "status='" + status + '\'' +
                ", code=" + code +
                ", total=" + total +
                ", data=" + datas +
                '}';
    }
}
