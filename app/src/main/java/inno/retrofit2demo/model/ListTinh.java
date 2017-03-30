package inno.retrofit2demo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListTinh {

    @SerializedName("Tinh")
    @Expose
    private Tinh tinh;
    @SerializedName("ListHuyen")
    @Expose
    private List<ListHuyen> listHuyen = null;

    public Tinh getTinh() {
        return tinh;
    }

    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

    public List<ListHuyen> getListHuyen() {
        return listHuyen;
    }

    public void setListHuyen(List<ListHuyen> listHuyen) {
        this.listHuyen = listHuyen;
    }

}