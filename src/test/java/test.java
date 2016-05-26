import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	//If incorrect
	@Test
	public void Test() {
		assertFalse(Input.test("Hi"));
	}
	
	//If correct
		@Test
		public void Test1() {
			assertTrue(Input.test("Hello"));
		}

}