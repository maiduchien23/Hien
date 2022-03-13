package com.company;

public class product {

    public static void main(String[] args){
        int productID = 19845;
        String productName = "MensTrouser";
        char prodcutType = 'A';
        short quantity = 148;
        double productPirce = 15_25_4.65;
        int barcodeNumber = 0b1101_0101_0001_1010;
        boolean availableStatus = true;

        System.out.println("\tProduct Details");
        System.out.println("--------------------------");
        System.out.println("Product Identification  Code:" + productID);
        System.out.println("Product Name:" + productName);
        System.out.println("Product Category (A: Apparels G: Gadgers) :" + prodcutType);
        System.out.println("Product Quatity:" + quantity);
        System.out.println("Product Price: $" + productPirce);
        System.out.println("Product BarCode Number:" + barcodeNumber);
        System.out.println("Product Availability" + availableStatus);


    }
}
