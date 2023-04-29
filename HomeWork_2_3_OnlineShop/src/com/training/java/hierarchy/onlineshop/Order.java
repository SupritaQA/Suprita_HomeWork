package com.training.java.hierarchy.onlineshop;

import java.util.List;
import java.util.Objects;

public class Order extends Customer {
    private String orderId ;

    private String orderDate ;

    private String productId ;



    private Payment paymentInfo ;

    private List<Object> items ;

    private Address customerAddress ;

    public Order(String firstName, String lastName, String phoneNumber,
                 String orderId , String orderDate , String productId ,Payment paymentInfo) {
        super(firstName, lastName, phoneNumber);
        this.orderId = orderId ;
        this.orderDate = orderDate;
        this.productId = productId;
        this.paymentInfo = paymentInfo ;

    }



    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }



    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Payment getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(Payment paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", productId='" + productId + '\'' +
                ", paymentInfo='" + getPaymentInfo() + '\'' +
                ", customer='" + super.getFirstName() + " " +  super.getLastName()  + " , phone : " + super.getPhoneNumber() + '\'' +
                ", " + getCustomerAddress() +
                ", items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getOrderId(), order.getOrderId()) && Objects.equals(getOrderDate(), order.getOrderDate()) && Objects.equals(getProductId(), order.getProductId()) && Objects.equals(getPaymentInfo(), order.getPaymentInfo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOrderId(), getOrderDate(), getProductId(), getPaymentInfo());
    }
}
