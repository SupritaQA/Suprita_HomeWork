package com.training.java.hierarchy.onlineshop;

public class Store extends Website {


    private String phoneNumber;

    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Store(String websiteName , String phoneNumber, String address) {
        super(websiteName) ;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
