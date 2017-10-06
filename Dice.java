package terning;

//Hejsa
// Hey Caro!! :P
public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		return (int)(Math.random() * 6+1); // forbedre coden, sådan at tad er random
//		float d1=(float)Math.random();     // 0-1
//		float d2=d1*5;                     // 0-5
//		int d3=Math.round(d2);             // 0-5 integer
//		return d3 + 1;                     // 1-6		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.ut.prnt(roll() + " ");
		}		
	}
}
