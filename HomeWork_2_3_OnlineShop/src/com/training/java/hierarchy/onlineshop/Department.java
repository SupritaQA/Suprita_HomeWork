package com.training.java.hierarchy.onlineshop;

public class Department extends Store{

    private String depId ;

    private String depName ;

    private String deptType ;

    public Department(String websiteName,
                      String phoneNumber, String address,
                      String depId, String depName, String deptType) {
        super(websiteName, phoneNumber, address);
        this.depId = depId;
        this.depName = depName;
        this.deptType = deptType;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }


    @Override
    public String toString() {
        return "Department{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                ", deptType='" + deptType + '\'' +
                '}';
    }
}
