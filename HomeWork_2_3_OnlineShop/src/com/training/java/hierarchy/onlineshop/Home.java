package com.training.java.hierarchy.onlineshop;

public class Home extends Department {

    private String homeId;


    private String homeName;

    public Home(String websiteName,
                String phoneNumber, String address,
                String depId, String depName, String deptType,
                String homeId, String homeName) {
        super(websiteName, phoneNumber, address, depId, depName, deptType);
        this.homeId = homeId;
        this.homeName = homeName;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }
}
