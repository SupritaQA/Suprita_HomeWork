package com.training.java.hierarchy.onlineshop;

import java.util.List;

public class Website {

    private String name ;

    private List<Customer> customers  ;

    public Website(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
