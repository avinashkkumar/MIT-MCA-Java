package labAssignment;

import java.util.Scanner;

/**
 * 5.	Accept number from command line and display whether it is prime or not.
 */

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        boolean flag = false;
        System.out.print("enter the number for the check of prime or not :");
        inp = sc.nextInt();
        for (int i = 2; i < inp ; i++) {
            if (inp%i == 0) {
                flag = false;
                break;
            }else{
                flag = true;
            }
        }
        if (inp == 1){
            System.out.println("the number is which is nither a prime nor a composite number");
        }else if(flag == true){
            System.out.println("Its a prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
