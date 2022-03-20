package com.akshay;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.print("enter the  operator:");
        Scanner op=new Scanner(System.in);
        char operator = op.next().trim().charAt(0);


        switch (operator){
            case '+':
                System.out.println("enter the operands:");
                int a=op.nextInt();
                int b=op.nextInt();
                int c =a+b;
                System.out.println("addition is :"+c);
                break;
            case '-':
                System.out.println("enter the operands:");
                 a=op.nextInt();
                 b=op.nextInt();
                 c =a-b;
                System.out.println("sub is :"+c);
                break;
            case '*':
                System.out.println("enter the operands:");
                 a=op.nextInt();
                 b=op.nextInt();
                 c =a*b;
                System.out.println("mul is :"+c);
                break;
            case '/':
                System.out.println("enter the operands:");
                 a=op.nextInt();
                 b=op.nextInt();
                 c =a/b;
                System.out.println("div is :"+c);
                break;

            case '%':
                System.out.println("enter the oprands:");
                 a=op.nextInt();
                 b=op.nextInt();
                 c =a%b;
                System.out.println("mod is :"+c);
                break;
            default:
                System.out.println("enter a valid operator");
        }

    }
}
