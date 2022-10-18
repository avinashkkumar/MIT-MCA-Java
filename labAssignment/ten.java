package labAssignment;

import java.util.Scanner;

/**
 * 10.	Write a program to print the following triangle.

    1
    2    3
    4    5   6
    7    8   9  10
 */

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, num = 1;
        System.out.print("Enter the number of lines to print of pattern : ");
        n = sc.nextInt();
        n = n+1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + "\t");
                num += 1;
            }
            System.out.println("\n");
        }

    }
}
