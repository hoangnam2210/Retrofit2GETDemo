package inno.retrofit2demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Xa {

    @SerializedName("PRE")
    @Expose
    private String pRE;
    @SerializedName("Ten")
    @Expose
    private String ten;
    @SerializedName("Ma")
    @Expose
    private String ma;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Type")
    @Expose
    private Integer type;

    public String getPRE() {
        return pRE;
    }

    public void setPRE(String pRE) {
        this.pRE = pRE;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}