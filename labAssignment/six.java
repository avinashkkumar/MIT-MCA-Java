package labAssignment;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of times for series iteration : ");
        n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            sum = sum + (i*i);
        }
        System.out.println("the sum of numbers is : " + sum);
        sc.close();
    }
}
