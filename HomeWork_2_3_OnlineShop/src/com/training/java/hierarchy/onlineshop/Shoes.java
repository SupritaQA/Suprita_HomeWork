package com.training.java.hierarchy.onlineshop;

public class Shoes extends Department{

    private String shoesId ;

    private String shoesName ;


    public Shoes(String websiteName,
                 String phoneNumber, String address,
                 String depId, String depName, String deptType,
                 String shoesId , String shoesName) {
        super(websiteName, phoneNumber, address, depId, depName, deptType);
        this.shoesId = shoesId ;
        this.shoesName = shoesName ;
    }

    public String getShoesId() {
        return shoesId;
    }

    public void setShoesId(String shoesId) {
        this.shoesId = shoesId;
    }

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }


}
