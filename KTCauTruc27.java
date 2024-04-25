import org.junit.Assert;
import org.junit.Test;

public class KTCauTruc27 {
	@Test
	public void testGCD() {
	    // Test case 1: m = 36, n = 48
	    int m1 = 36;
	    int n1 = 48;
	    int expectedResult1 = 12;
	    int actualResult1 = calculateGCD(m1, n1);
	    Assert.assertEquals(expectedResult1, actualResult1);
	    
	    // Test case 2: m = 17, n = 29
	    int m2 = 17;
	    int n2 = 29;
	    int expectedResult2 = 1;
	    int actualResult2 = calculateGCD(m2, n2);
	    Assert.assertEquals(expectedResult2, actualResult2);
	    
	    // Test case 3: m = 0, n = 10
	    int m3 = 0;
	    int n3 = 10;
	    int expectedResult3 = 10;
	    int actualResult3 = calculateGCD(m3, n3);
	    Assert.assertEquals(expectedResult3, actualResult3);
	    
	    // Test case 4: m = 100, n = 0
	    int m4 = 100;
	    int n4 = 0;
	    int expectedResult4 = 100;
	    int actualResult4 = calculateGCD(m4, n4);
	    Assert.assertEquals(expectedResult4, actualResult4);
	}

	private int calculateGCD(int m, int n) {
	    while (n > m) {
	        int r = m;
	        m = n;
	        n = r;
	    }

	    int r = m % n;
	    while (r != 0) {
	        m = n;
	        n = r;
	        r = m % n;
	    }

	    return n;
	}
}