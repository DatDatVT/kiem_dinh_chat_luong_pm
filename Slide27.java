import java.util.Scanner;

public class Slide27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of m and n: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int r;
        while (n > m) {
            r = m;
            m = n;
            n = r;
        }

        r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }

        System.out.println("The greatest common divisor is: " + n);
    }
}

