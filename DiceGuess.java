/**
 * 
 * @author rlong19
 *Write a program which creates two Dice
 *objects.  Prompts the user for a target
 *value between 2 and 12.  Make sure that
 *the target value is valid.  If it is
 *not, prompt the user again.  Roll the
 *two dice until the target is rolled.
 *Display each roll and their sum, and
 *display the total number of rolls before
 *the target was reached. 
 *instance var, construc, methods
 */
import java.util.Scanner;
public class DiceGuess 
{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DiceRoll dice1 = new DiceRoll();
		DiceRoll dice2 = new DiceRoll();
		int ROLL1 = dice1.roll();
		int ROLL2 = dice2.roll();
		boolean run=true;
		while (run==true)
		{
			System.out.print("Please guess a number rolled from two dice: ");
			int guess= in.nextInt();
			if (!(guess<=2 || guess>=12))
			{
				
			}
		}
			
	}
}
	