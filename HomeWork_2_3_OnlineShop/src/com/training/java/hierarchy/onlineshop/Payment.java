package com.training.java.hierarchy.onlineshop;

public abstract class Payment {


    private String paymentId;
    private String paymentType ;

    private String paymentAmount ;

    public Payment(String paymentId, String paymentType, String paymentAmount) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }

    public abstract double getTotalPayment(String paymentAmount);

    public String getPaymentType() {
        return paymentType;
    }


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentid='" + paymentId + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                '}';
    }
}
