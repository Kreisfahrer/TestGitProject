import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PrimerNumberCheckerTest {

    @Test
    public void seventeenShouldBePrimeTest() {
        // arrange
        int testNumber = 17;
        // act
        boolean result = PrimeNumberChecker.isPrime(testNumber);
        // assert
        Assert.assertTrue(result, "Number " + testNumber + " is said to be not prime, but we were expected prime number");
    }

    @Test
    public void seventeenShouldBePrimeTest1() {
        // arrange
        int testNumber = 17;
        // act
        boolean result = PrimeNumberChecker.isPrime(testNumber);
        // assert
        Assert.assertTrue(false, "Number " + testNumber + " is said to be not prime, but we were expected prime number");
    }
}
