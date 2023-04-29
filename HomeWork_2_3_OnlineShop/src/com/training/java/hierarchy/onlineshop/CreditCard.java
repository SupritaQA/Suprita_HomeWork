package com.training.java.hierarchy.onlineshop;

public class CreditCard extends Payment{

    private double cc_fee = 0.25 ;

    private String cardType ;

    private String cardNumber ;

    private String amount ;
    public CreditCard(String paymentId, String paymentType, String paymentAmount,
                      String cardType , String cardNumber ) {
        super(paymentId, paymentType, paymentAmount);
        this.cardType = cardType ;
        this.cardNumber = cardNumber ;
        this.amount = paymentAmount ;

    }

    @Override
    public double getTotalPayment(String paymentAmount) {

        return Double.valueOf(paymentAmount) + cc_fee ;
    }


}
