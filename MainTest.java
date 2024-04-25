import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    
    @Test
    public void testNegativeNumber() {
        // Arrange
        int number = -5;
        
        // Act & Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ThucHanhTuanMotBuoiHai.main(new String[] {});
        });
    }
    
    @Test
    public void testZero() {
        // Arrange
        int number = 0;
        
        // Act & Assert
        Assertions.assertDoesNotThrow(() -> {
            ThucHanhTuanMotBuoiHai.main(new String[] {});
        });
    }
    
    @Test
    public void testPositiveNumber() {
        // Arrange
        int number = 10;
        
        // Act & Assert
        Assertions.assertDoesNotThrow(() -> {
            ThucHanhTuanMotBuoiHai.main(new String[] {});
        });
    }
}