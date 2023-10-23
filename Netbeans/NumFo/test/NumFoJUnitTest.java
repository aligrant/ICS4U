
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for the methods in the NumFo class.
 *
 * @author Alessandra
 * @version 1.0
 * @since 1.0
 */
public class NumFoJUnitTest {

    NumFo nf;

    public NumFoJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Calling the @BeforeClass method.");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Calling the @AfterClass method.");
    }

    @Before
    public void setUp() {
        System.out.println("Calling the @Before method.(before each test method)");
        nf = new NumFo();
    }

    @After
    public void tearDown() {
        System.out.println("Calling the @After method.(before each test method)");
        nf = null;
    }

    /**
     * Test isPrime method of class NumFo
     */
    @Test
    public void isPrimeTest() {
        System.out.println("isPrime");
        int num = 97;
        boolean prime = nf.isPrime(num);
        assertEquals(prime, true);

    }

    /**
     * Test isPrime method of class NumFo
     */
    @Test
    public void getFactorsTest() {
        System.out.println("getFactors");
        int num = 97;
        Set<Integer> factors = nf.getFactors(num);
        Set<Integer> correct = new HashSet<>(Arrays.asList(1, 97));
        assertEquals(factors, correct);

    }

    /**
     * Test getRoot method of class NumFo
     */
    @Test
    public void getRootTest() {
        System.out.println("getRoot");
        int num = 25;
        Double root = nf.getRoot(num);
        assertEquals(num, 25);

    }
}
