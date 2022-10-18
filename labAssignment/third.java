package labAssignment;

import java.util.Scanner;

/**
 * third
 * 3.	Write a program to convert the given temperature in farenheit to Celsius using the follwing conversion formula.

 *      C =   (f - 32)/1.8
 */
public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ftemp,ctemp;
        System.out.print("enter the temprature in farenheit : ");
        ftemp = sc.nextFloat();
        ctemp = (float) ((ftemp -32)/1.8);
        System.out.println("the temprature in celcius is " + ctemp);
    }
}