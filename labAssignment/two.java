package labAssignment;

import java.util.Scanner;

/**
 * two
 * 2.	Write a program to read the price of an item in decimal from user(like 75.95) and 
        print the output in paise.
 */
public class two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Product");
        float price = sc.nextFloat();
        System.out.println("the price of the procuct in paise is " + (price * 100));

        sc.close();
    }
}