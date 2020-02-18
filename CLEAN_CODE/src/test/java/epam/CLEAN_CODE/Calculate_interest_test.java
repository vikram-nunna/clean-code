package epam.CLEAN_CODE;
import org.junit.*;
import junit.framework.TestCase;

public class Calculate_interest_test extends TestCase {
	
	Calculate_interest cal=new Calculate_interest();
	@Test
	public void testsi()
	{
		assertEquals(7950.0, cal.si(7500, 2, 3));
		
	}
	@Test
	public void testci()
	{
		assertEquals(304.5,cal.ci(5000, 2, 3));
	}

}
