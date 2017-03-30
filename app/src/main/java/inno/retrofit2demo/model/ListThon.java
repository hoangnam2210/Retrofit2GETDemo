package inno.retrofit2demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListThon {

    @SerializedName("Thon")
    @Expose
    private Thon thon;

    public Thon getThon() {
        return thon;
    }

    public void setThon(Thon thon) {
        this.thon = thon;
    }

}