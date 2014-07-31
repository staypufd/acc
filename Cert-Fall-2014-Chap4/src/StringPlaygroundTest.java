import static org.junit.Assert.*;

import org.junit.Test;


public class StringPlaygroundTest {

	@Test
	public void testMain() {
		
		// fail("Not yet implemented"); // TODO
		assertEquals("abc", "abc");
	}
	
	@Test
	public void testStringIdentityEquivalance() {
		assertSame("abc", "abc");
	}
	
	

}
