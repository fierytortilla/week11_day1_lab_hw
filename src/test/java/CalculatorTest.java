import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator= new Calculator();
    }

    @Test
    public void add(){
        int result= calculator.add(1, 3);
        assertEquals(4, result);
    }

    public void subtract(){
        int result= calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    public void multiply(){
        int result= calculator.multiply(8, 2);
        assertEquals(16, result);
    }

    public void divide(){
        int result= calculator.divide(6, 3);
        assertEquals(2, result);
    }


}
