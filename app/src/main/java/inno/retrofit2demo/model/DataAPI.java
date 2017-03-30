package inno.retrofit2demo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataAPI {

    @SerializedName("ListTinh")
    @Expose
    private List<ListTinh> listTinh = null;

    public List<ListTinh> getListTinh() {
        return listTinh;
    }

    public void setListTinh(List<ListTinh> listTinh) {
        this.listTinh = listTinh;
    }

}