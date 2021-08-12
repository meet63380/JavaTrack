/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class TeamNameMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws TeamNameNotFoundException{
		// TODO Auto-generated method stub
		String runnerTeam, winnerTeam;
		String teamNames[] = {"Chennai Super Kings",
				 "Sun Risers Hyderabad",
				 "Delhi Capitals",
				 "Kings XI Punjab",
				 "Kolkata Knight Riders",
				 "Mumbai Indians",
				 "Rajasthan Royals",
				 "Royal Challengers Bangalore"	};
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the expected winner team of IPL Season 13");
			winnerTeam = sc.nextLine();
			if(!Arrays.asList(teamNames).contains(winnerTeam)) {
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
			
			System.out.println("Enter the expected runner Team of IPL Season 13");
			runnerTeam = sc.nextLine();
			if(!Arrays.asList(teamNames).contains(runnerTeam)) {
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
			
			System.out.println("Expected IPL Season 13 winner: " +winnerTeam);
			System.out.println("Expected IPL Season 13 runner: " +runnerTeam);
		} catch (TeamNameNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

