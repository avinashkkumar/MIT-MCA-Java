package labAssignment;

import java.util.Scanner;

/**
 * one
 * Write a Program to determine the sum of the following harmonic series for a given value of ‘n’ from user.
            1+1/2+1/3+……..+1/n
 */
public class one {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n, i;
        float s = 0;

        System.out.println("Enter the number of times to get the harmonic value of the number");
        n = sc.nextInt();
        for(i = 1 ; i < (n + 1) ; i++){
            s = s  + 1/i;
        }

        System.out.print("The harmonic value of the given number " + n + " is ");
        System.out.println(s);
        
        sc.close();
    }
}