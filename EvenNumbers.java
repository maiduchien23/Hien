package com.company;

public class EvenNumbers {
    public static void main(String [] args) {
        int i = 0, sum = 0 ;

        while (i <= 20 ){

        if (i % 2 == 0 ){
            sum += 1 ;

        }
        i++;
    }
    System.out.println("Sum of first 10 even number is:" + sum);
    }
}
