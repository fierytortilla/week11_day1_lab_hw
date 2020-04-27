import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer= new Printer();
        printer.setSheetsLeft(20);
        printer.setTonerVolume(100);
    }

    @Test
    public void print(){
        printer.print(5, 2);
        assertEquals(10, printer.getSheetsLeft());
        assertEquals(90, printer.getTonerVolume());
        printer.print(4, 10);
        assertEquals(10, printer.getSheetsLeft());
        assertEquals(90, printer.getTonerVolume());

    }
}
