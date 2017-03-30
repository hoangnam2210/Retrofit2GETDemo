package inno.retrofit2demo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListHuyen {

    @SerializedName("Huyen")
    @Expose
    private Huyen huyen;
    @SerializedName("ListXa")
    @Expose
    private List<ListXa> listXa = null;

    public Huyen getHuyen() {
        return huyen;
    }

    public void setHuyen(Huyen huyen) {
        this.huyen = huyen;
    }

    public List<ListXa> getListXa() {
        return listXa;
    }

    public void setListXa(List<ListXa> listXa) {
        this.listXa = listXa;
    }

}