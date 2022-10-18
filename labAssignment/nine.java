package labAssignment;

/**
 * 
 *9.	Write a program to display alternate characters of alphabets (a c e g i……..)
 */

public class nine {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 13; i++) {
            System.out.printf("%c ", c + (i + i));
        }
    }
}
