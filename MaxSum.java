import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maxint: ");
        int maxint = scanner.nextInt();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();

        int result = 0;
        int i = 0;

        if (value < 0) {
            value = -value;
        }

        while (i < value && result <= maxint) {
            i++;
            result++;
        }

        if (result <= maxint) {
            System.out.println(result);
        } else {
            System.out.println("too large");
        }
    }
}