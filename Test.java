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

	@Test
	public void testRoll() {
		int[] values = {0, 0, 0, 0, 0, 0};
		int currentRoll = 0;
		boolean deviationTooBig = false;
		for(int i = 0; i < 60000; i++) {
			currentRoll = testDice.roll();
			values[currentRoll-1]++;
		}
		int sum = 0;
		for(int i = 0; i < 6; i++) {
			sum += values[i];
		}
		System.out.println("1: "+ values[0] + ", 2: " + values[1] + ", 3: " + values[2] + ", 4: " + values[3] + ", 5: " + values[4] + ", 6: " + values[5]);
		System.out.println(sum);		
		assertEquals(sum, 60000);
	}
	@Test
	public void testDeviation() {
		int[] values = {0, 0, 0, 0, 0, 0};
		int currentRoll = 0;
		boolean deviationTooBig = false;
		for(int i = 0; i < 60000; i++) {
			currentRoll = testDice.roll();
			values[currentRoll-1]++;
		}
		for(int i = 0; i < 6; i++) {
			if(values[i] < 9600 || values[i] > 10400) {
				deviationTooBig = true;
			}
		}
		assertEquals(deviationTooBig, false);
	}
}
