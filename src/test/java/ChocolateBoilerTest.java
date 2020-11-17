import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ChocolateBoilerTest {

    @Test
    public void twoChocolateBoilersMightBlowTheFactory() {
    	
        ChocolateBoiler c1 = ChocolateBoiler.getInstance();
        ChocolateBoiler c2 = ChocolateBoiler.getInstance();

        String result = new String();
        result = c1.fill() + "/" + c1.boil() + "/" + c2.fill();
        String unExpected = "Filling/Boiling/Filling";
        assertFalse(unExpected.equals(result));
    }
    
    @Test
    public void twoChocolateBoilersAreAlwaysTheSame() {
        ChocolateBoiler c1 = ChocolateBoiler.getInstance();
        ChocolateBoiler c2 = ChocolateBoiler.getInstance();

        assertTrue(c1==c2);
    }
}