package com.company;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {

        int orderedShirts, orderedTrousers, points = 0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfshirts ,costOfTrousers , totalCost;
        double discount, netPay;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to oeder:");
        orderedTrousers = input.nextInt();

        costOfshirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfshirts + costOfTrousers;


        discount = totalCost > 3000 ? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        points = (int) (netPay > 3000 ? netPay / 100 : 0);

        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.println("----------------------------------------" + "-----------------");
        System.out.printf("Shirts \t\t %d \t\t %d \t\t %d \n",orderedShirts ,priceOfShirt, costOfshirts);
        System.out.printf("Trousers \t %d \t\t %d \t\t %d \n", orderedTrousers, priceOfTrouser, costOfTrousers);
        System.out.printf("Discount \t \t\t \t\t %.2f \n" ,discount);
        System.out.println("-----------------------------------------" + "----------------");
        System.out.printf("Net Total \t \t\t \t\t %.2f \n", netPay);
        System.out.println("-----------------------------------------" + "----------------");
        System.out.printf("Points Earned \t %d \n", points);

    }
}
