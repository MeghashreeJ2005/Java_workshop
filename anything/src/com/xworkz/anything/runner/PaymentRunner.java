package com.xworkz.anything.runner;

import com.xworkz.anything.things.Payment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PaymentRunner {
    public static void main(String[] args){
        System.out.println("payment detail");
        Payment.displayPaymentInformation();
        Payment.displayPaymentAmount( 2000);
        Payment.displayTransactionDetails(3000, LocalDateTime.now() );
    }
}