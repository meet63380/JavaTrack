/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentscore, target;
		float currentover;
		System.out.println("Enter the match format\n"
				+ "1.	ODI\n"
				+ "2.	T20\n"
				+ "3.	Test");
		int matchFormatChoice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Current score");
		currentscore = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the current Over");
		currentover = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the Target Score");
		target = sc.nextInt();
		sc.nextLine();
		
		switch(matchFormatChoice) {
		case 1: {
			ODIMatch odim = new ODIMatch();
			odim.setCurrentscore(currentscore);
			odim.setCurrentover(currentover);
			odim.setTarget(target);
			odim.display(odim.calculateRunRate(), odim.calculateBalls());
			break;
		}
		case 2: {
			
			T20Match t20m = new T20Match();
			t20m.setCurrentscore(currentscore);
			t20m.setCurrentover(currentover);
			t20m.setTarget(target);
			t20m.display(t20m.calculateRunRate(), t20m.calculateBalls());
			break;
			
		}
		case 3: {
			
			TestMatch testm = new TestMatch();
			testm.setCurrentscore(currentscore);
			testm.setCurrentover(currentover);
			testm.setTarget(target);
			testm.display(testm.calculateRunRate(), testm.calculateBalls());
			break;	
		}
		default: {
			System.out.println("Enter a valid choice");
			break;
		}
		
		}
		
		sc.close();

	}

}
