package labAssignment;
 /**
  * 4.	Write a program to find the number of and sum of all integer greater than 100 and    
  * less than 200 that are divisible by 7.
  */
public class four {
    public static void main(String[] args) {
        int flag = 0;
        int sum = 0;
        for (int i = 100; i < 200 ; i++) {
            if (i%7 == 0) {
                flag = flag + 1;
                sum = sum + i;
            }
        }
        System.out.println("The sum of integers that are between 100 and 200 and divisible by 7 is " + sum);
        System.out.println("And the number of occurence of such integer is " + flag);
    }
}
