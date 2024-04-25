import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaoPhuDuongDi {

    @Test
    public void testNegativeNumber() {
        assertEquals("Số không hợp lệ!", checkNumberValidity(-5));
    }

    @Test
    public void testZero() {
        assertEquals("Số không hợp lệ!", checkNumberValidity(0));
    }

    @Test
    public void testEvenNumber() {
        assertEquals("0 là số chẵn\n2 là số chẵn\n4 là số chẵn", printEvenOddNumbers(4));
    }

    @Test
    public void testOddNumber() {
        assertEquals("1 là số lẻ\n3 là số lẻ\n5 là số lẻ", printEvenOddNumbers(5));
    }
    
    private String checkNumberValidity(int number) {
        if (number <= 0) {
            return "Số không hợp lệ!";
        }
        return "";
    }

    private String printEvenOddNumbers(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                result.append(i + " là số chẵn\n");
            } else {
                result.append(i + " là số lẻ\n");
            }
        }
        return result.toString().trim();
    }
}