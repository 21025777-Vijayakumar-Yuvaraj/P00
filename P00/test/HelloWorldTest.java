import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("This is the testcase for HelloWorld");
		String str1 = "This is the testcase for HelloWorld";
		String str2 = "This is the testcase for HelloWorld";
		assertEquals(str1, str2);
	}

}
