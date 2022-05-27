import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// Class container
public class CalculatorTest {
	int a, b;
	Calculator cal;
	

	
	@Before
	public void setUp() throws Exception {
		a = 4321;
		b = 1234;
		cal=new Calculator();
		
	}

	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int actual = cal.add(a,  b);
        int expected = 5555;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtract() {
		
		
		int actual = cal.subtract(a,  b);
		int expected = 3087;
		assertEquals (expected, actual);
		
		
	}
	@Test
	public void testMultiply() {
        
		
		
		int actual = cal.multiply(a,  b);
		int expected = 5332114;
		assertEquals (expected, actual);
	}
	@Test
	public void testDivide() {
       
		
		
		int actual = cal.divide(a,  b);
		int expected = 3;
		assertEquals (expected, actual);
		
	}
	@After
	public void tearDown() throws Exception {
		a = 0;
		b = 0;
	}

}
