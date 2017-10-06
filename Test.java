package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

 	@Before
	public void setUp() throws Exception 
  {
	  		Dice testDice = new Dice();
  }

	@Test
	public void test() {
  
		int expected = 0;
		boolean success = true;
		boolean failure = false;
		
		for(int i = 0; i <= 60000; i++)
		{
			expected = testDice.roll();
			if(expected < 1 || expected > 6)
			{
				//do nothing
				assertEquals(failure, true);
			} 
		}
		assertEquals(success, true);
	}
  
  -------------------------------------------------------------
  
}
