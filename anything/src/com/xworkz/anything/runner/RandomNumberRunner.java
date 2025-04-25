package com.xworkz.anything.runner;

import com.xworkz.anything.things.RandomNumber;
public class RandomNumberRunner{
        public static void main(String[] args) {
            System.out.println("random number");
            int number = RandomNumber.getRandomNumber();
            System.out.println("number is:" + number);
        }

}
