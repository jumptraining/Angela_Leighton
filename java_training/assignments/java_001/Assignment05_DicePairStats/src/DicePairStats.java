public class DicePairStats {

	public static void main(String[] args) {

		//declare two-dimensional array
		int[][] diceRolls = new int[6][6];
		
		//store dice rolls
		int y,z;
		
		//fill diceLabels array
		diceRolls[0][0] = 0;
		diceRolls[0][1] = -1;
		diceRolls[0][2] = -1;
		diceRolls[0][3] = -1;
		diceRolls[0][4] = -1;
		diceRolls[0][5] = -1;
		diceRolls[1][0] = 0;
		diceRolls[1][1] = 0;
		diceRolls[1][2] = -1;
		diceRolls[1][3] = -1;
		diceRolls[1][4] = -1;
		diceRolls[1][5] = -1;
		diceRolls[2][0] = 0;
		diceRolls[2][1] = 0;
		diceRolls[2][2] = 0;
		diceRolls[2][3] = -1;
		diceRolls[2][4] = -1;
		diceRolls[2][5] = -1;
		diceRolls[3][0] = 0;
		diceRolls[3][1] = 0;
		diceRolls[3][2] = 0;
		diceRolls[3][3] = 0;
		diceRolls[3][4] = -1;
		diceRolls[3][5] = -1;
		diceRolls[4][0] = 0;
		diceRolls[4][1] = 0;
		diceRolls[4][2] = 0;
		diceRolls[4][3] = 0;
		diceRolls[4][4] = 0;
		diceRolls[4][5] = -1;
		diceRolls[5][0] = 0;
		diceRolls[5][1] = 0;
		diceRolls[5][2] = 0;
		diceRolls[5][3] = 0;
		diceRolls[5][4] = 0;
		diceRolls[5][5] = 0;
		
		//report header
		System.out.println("1000 Random 2 dice toss stats");
		
		//roll the die if the user doesn't quit
		for (int x=0;x<1000;x++){
			//roll first die
			y = dieRoll();
			
			//roll second die
			z = dieRoll();
			
			//store with high number first
			if (y > z) {
				diceRolls[y-1][z-1]++;
			}else {
				diceRolls[z-1][y-1]++;
			}
		}
		
		int max = diceRolls[0][0];
		int first = -1;
		int second = -1;
		int q = 0;
		
		do {
			max = 0;
			for(int a=0;a<6;a++) {
				for(int b=0;b<6;b++) {
					if (diceRolls[a][b] > max) {
						max = diceRolls[a][b];
						first = a + 1;
						second = b + 1;
					}
				}
			}
			
			//Print out largest roll left
			System.out.println("Dice " + first + " and " + second + ": " + max + " times");
			
			//change array value to -1 
			diceRolls[first-1][second-1] = -1;
			q++;
		}while (q < 21);
		
	}
	
	static int dieRoll() {
		
		//get a random number between 1 and 6 inclusive
		int roll = (int)(Math.random() * 6) + 1;
		
		//return random number
		return roll;
	}

}
