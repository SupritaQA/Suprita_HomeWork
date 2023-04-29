package com.training.java.hierarchy.onlineshop;

import java.util.Objects;

public class Address extends Customer{
    private String houseNumber ;

    private String streetName ;

    private String city ;

    private String state ;

    private String zipCode ;

    public Address(String firstName, String lastName, String phoneNumber, String houseNumber, String streetName, String city, String state, String zipCode) {

        super(firstName, lastName, phoneNumber );
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +

                '}'
                + ", Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getHouseNumber(), address.getHouseNumber()) && Objects.equals(getStreetName(), address.getStreetName()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getZipCode(), address.getZipCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHouseNumber(), getStreetName(), getCity(), getState(), getZipCode());
    }
}
