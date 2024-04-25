import java.util.Scanner;

public class ThucHanhTuanMotBuoiHai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 0) {
            System.out.println("Số không hợp lệ!");
            return;
        }

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
            } else {
                System.out.println(i + " là số lẻ");
            }
        }
    }
}