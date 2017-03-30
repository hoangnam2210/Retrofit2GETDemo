package inno.retrofit2demo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListXa {

    @SerializedName("Xa")
    @Expose
    private Xa xa;
    @SerializedName("ListThon")
    @Expose
    private List<ListThon> listThon = null;

    public Xa getXa() {
        return xa;
    }

    public void setXa(Xa xa) {
        this.xa = xa;
    }

    public List<ListThon> getListThon() {
        return listThon;
    }

    public void setListThon(List<ListThon> listThon) {
        this.listThon = listThon;
    }

}