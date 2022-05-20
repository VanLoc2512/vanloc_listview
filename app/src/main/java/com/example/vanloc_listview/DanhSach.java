package com.example.vanloc_listview;

import java.util.ArrayList;

public class DanhSach {
    int logo;
    String ten;
    String ca;
    int muiten;
    public DanhSach(int logo, String ten, String ca, int muiten)
    {
        this.logo=logo;
        this.muiten=muiten;
        this.ten=ten;
        this.ca=ca;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setMuiten(int muiten) {
        this.muiten = muiten;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getCa() {
        return ca;
    }

    public int getMuiten() {
        return muiten;
    }

    public int getLogo() {
        return logo;
    }

    public static ArrayList<DanhSach> dulieu(){
        ArrayList<DanhSach> x =new ArrayList<>();
        int logo[]={R.drawable.img};
        String ten[]={"CĐ DTTT 20A","CĐ DTTT 20A","CĐ DTTT 20A","CĐ DTTT 20B","CĐ DTTT 20B","CĐ DTTT 20B","CĐ DTTT 21A","CĐ DTTT 21A","CĐ DTTT 21A","CĐ DTTT 21B","CĐ DTTT 21B","CĐ DTTT 21B"};
        String ca[]={"ca 1","ca 2","ca 3","ca 1","ca 2","ca 3","ca 1","ca 2","ca 3","ca 1","ca 2","ca 3"};
        int muiten[]={R.drawable.ic_baseline_navigate_next_24};
        for(int i=0;i<ten.length;i++)

            x.add(new DanhSach(logo[0],ten[i],ca[i],muiten[0]));
        return x;




    }


}
