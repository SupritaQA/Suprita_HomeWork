package com.training.java.hierarchy.onlineshop;

public class Clothing extends Department{

    private String clothingId ;



    private String clothingName ;


    public Clothing(String websiteName,
                    String phoneNumber, String address,
                    String depId, String depName,String deptType,
                    String clothingId , String clothingName) {
        super(websiteName, phoneNumber, address, depId, depName, deptType);
        this.clothingId = clothingId ;
        this.clothingName = clothingName ;

    }

    public String getClothingId() {
        return clothingId;
    }

    public void setClothingId(String clothingId) {
        this.clothingId = clothingId;
    }

    public String getClothingName() {
        return clothingName;
    }

    public void setClothingName(String clothingName) {
        this.clothingName = clothingName;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "clothingId='" + clothingId + '\'' +
                ", clothingName='" + clothingName + '\'' +
                ", website='" + super.getName() + '\'' +
                ", department='" + super.getDepName() + '\'' +
                ", store address='" + super.getAddress() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +

                '}';
    }
}
