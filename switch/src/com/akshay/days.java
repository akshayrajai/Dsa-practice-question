package com.akshay;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        //check whether the day is weekend or not
        System.out.println("enter day");
        Scanner day=new Scanner(System.in);
        int no=day.nextInt();
        switch(no){
            case 1 -> System.out.println("monday");
            case 2-> System.out.println("tueday");
            case 3-> System.out.println("wedday");
            case 4-> System.out.println("thurday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("satday");
            case 7-> System.out.println("sunday");


            default -> System.out.println("enter valid no ");
        }
    }
}
