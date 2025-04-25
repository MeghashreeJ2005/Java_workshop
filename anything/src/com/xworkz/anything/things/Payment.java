package com.xworkz.anything.things;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Payment {
    public static String paymentFrom;
    public static String paymentTo;
    public static double amount;
    public static LocalDate transactionDate;
    public static LocalTime transactionTime;
    public static void  displayPaymentInformation(){
        paymentFrom="XYZ";
        paymentTo = "ABC";
        amount = 1000;
        transactionDate =LocalDate.now();
        transactionTime = LocalTime.now();
        System.out.println("payment from:"+paymentFrom);
        System.out.println("payment to:"+paymentTo);
        System.out.println("amount:"+amount);
        System.out.println("transaction Data:"+transactionDate);
        System.out.println("transaction Time:"+transactionTime);
    }
    public static void displayPaymentAmount(double paidAmount){
        System.out.println("paid amount is:"+paidAmount);
    }
    public static void  displayTransactionDetails(double paidAmount,LocalDateTime paymentDoneOn){
        System.out.println("paid amount is :"+amount);
        System.out.println("Payment Done on:"+paymentDoneOn);
    }
}

