package labAssignment;

public class seven {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            String x = "   ";
            System.out.print(x.repeat(5-i));
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
