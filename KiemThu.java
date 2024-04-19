import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KiemThu {
    @Test
    public void testTong() {
        int result = ViDu.tinhTong(3, 5);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testHieu() {
        int result = ViDu.tinhHieu(10, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testTich() {
        int result = ViDu.tinhTich(4, 6);
        Assertions.assertEquals(24, result);
    }

    @Test
    public void testThuong() {
        float result = ViDu.tinhThuong(10, 2);
        Assertions.assertEquals(5.0f, result);
    }

    @Test
    public void testChiaChoKhong() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            ViDu.tinhThuong(8, 0);
        });
    }

    @Test
    public void testDu() {
        int result = ViDu.tinhDu(15, 4);
        Assertions.assertEquals(3, result);
    }
}