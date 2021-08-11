/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class InningsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Innings in = new Innings();
		System.out.println("Enter the team name: ");
		in.setTeamName(sc.nextLine());
		System.out.println("Enter session:");
		in.setInningsName(sc.nextLine());
		System.out.println("Enter runs: ");
		in.setRuns(sc.nextInt());
		in.displayInningsDetails();
		sc.close();
		

	}

}
