package epam.CLEAN_CODE;

import static org.junit.Assert.*;

import org.junit.*;
import junit.framework.TestCase;

public class Calculate_cost_test {

	Calculate_cost cal=new Calculate_cost();
	@Test
	public void test() {
		assertEquals(1350000.0,cal.calcost(2,900,false),0);
	}

}
