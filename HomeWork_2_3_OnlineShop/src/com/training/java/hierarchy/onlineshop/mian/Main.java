package com.training.java.hierarchy.onlineshop.mian;

import com.training.java.hierarchy.onlineshop.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("***************** Hello and welcome to my OnlineShop! ******************************");

        String fName = "Tom";
        String lName = "Fred";
        String phNumber = "9123456789";

        String payment_clothing_id = "pay_123";

        Website shopping_website = new Website("www.MyOnlineShop.com");



        Store store_pa = new Store(shopping_website.getName(),
                "9111222333", "200 Market St, Exton, PA, 19341");


        Department dep_cloth = new Department(shopping_website.getName(),
                store_pa.getPhoneNumber(), store_pa.getAddress(),
                "cloth123", "clothing", "general");

        Clothing item_clothing = new Clothing(shopping_website.getName(),
                store_pa.getPhoneNumber(), store_pa.getAddress(),
                dep_cloth.getDepId(), dep_cloth.getDepName(), dep_cloth.getDeptType(),
                "shirt123", "Tshirt");


        Customer customer_1 = new Customer(fName, lName, phNumber);


        Address address = new Address(customer_1.getFirstName(), customer_1.getLastName(), customer_1.getPhoneNumber(),
                "1234", "main st", "exton", "PA", "19341");



//        1st order
        Payment payment_cc_clothing_1 = new CreditCard(payment_clothing_id, "cc", "10.00" ,
                "visa" , "4000500060007000" );

        Order order_clothing_1 = new Order(customer_1.getFirstName(), customer_1.getLastName(),customer_1.getPhoneNumber(),
                "orderid_123", "04/16/2023", "shirt123", payment_cc_clothing_1);




        List<Customer> customerList = new ArrayList<Customer>();

        customerList.add(customer_1);

        shopping_website.setCustomers(customerList);

        List<Clothing> itemList = new ArrayList<Clothing>();
        itemList.add(item_clothing);

        order_clothing_1.setItems(Collections.singletonList(itemList));

        order_clothing_1.setCustomerAddress(address);

        System.out.println("Website Name-->\t" + shopping_website.getName());
        System.out.println("Store Details-->\t" + store_pa.getName() + " : " + store_pa.getAddress() + " : " + store_pa.getPhoneNumber());
        System.out.println("Department-->\t" + dep_cloth.getDepName() + " : " + dep_cloth.getDeptType() );
        System.out.println("Product category-->\t" + item_clothing.getClothingName() );
        System.out.println("Ordered Item-->\t" + " order_id : " + order_clothing_1.getOrderId() + " , item : " + order_clothing_1.getProductId()
                            + " , order_date : " + order_clothing_1.getOrderDate());
        System.out.println("Payment Info-->\t" + "id : " + payment_cc_clothing_1.getPaymentId()  + " , payment_type : " + payment_cc_clothing_1.getPaymentType()
                            + " , payment_amount : " + payment_cc_clothing_1.getPaymentAmount());


        // 2nd order

        Payment payment_cc_clothing_2 = new CreditCard("pay_111", "cc", "20.00" ,
                "visa" , "4000500060007111" );

        Order order_clothing_2 = new Order(customer_1.getFirstName(), customer_1.getLastName(),customer_1.getPhoneNumber(),
                "orderid_222", "04/18/2023", "jeans123", payment_cc_clothing_2);


        // 3rd Order
        Payment payment_cc_clothing_3 = new CreditCard("pay_222", "cc", "30.00" ,
                "visa" , "4000500060007111" );

        Order order_clothing_3 = new Order(customer_1.getFirstName(), customer_1.getLastName(),customer_1.getPhoneNumber(),
                "orderid_333", "04/18/2023", "jacket123", payment_cc_clothing_3);


        // Calculate total purchase using abstract methods

        double pay_1 = payment_cc_clothing_1.getTotalPayment(payment_cc_clothing_1.getPaymentAmount());
        double pay_2 = payment_cc_clothing_2.getTotalPayment(payment_cc_clothing_2.getPaymentAmount());

        double pay_3 = payment_cc_clothing_3.getTotalPayment(payment_cc_clothing_3.getPaymentAmount());

        System.out.println("Total Purchases Amount --> " + ( pay_1 + pay_2 + pay_3) + " dollars") ;




        // toString method ...


        System.out.println("Shopping Website Details-->\t" + shopping_website);


        // equal + hashCode override

        Customer customer_2 =  customer_1 ;

        Customer customer_3 = new Customer("sk", "das", "4842001234");

        // Comparing same customer by equal method

        System.out.println("Is customer_1 = customer_2 : " + (customer_1 == customer_2));

        // Comparing different customer by equal method

        System.out.println("Is customer_1 = customer_3 : " + (customer_1 == customer_3));






    //    System.out.println("Customer Details -->\t" + address);

    //    System.out.println("Order Details -->\t" + order_clothing_1);






    }
}