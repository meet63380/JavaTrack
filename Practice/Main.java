/**
 * 
 */
package javaPractice;
import java.util.*;
/**
 * @author shahm
 *
 */
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String loopChoice = null;
		String playerName, wickets ;
		Map<String,Wicket> map = new HashMap<>();
		
		do {
			System.out.println("Enter the player name");
			playerName = sc.nextLine();
			System.out.println("Enter Wickets - seperated by \"|\" symbol");
			wickets = sc.nextLine();
			String[] wicketsArray = wickets.split("%|%");
			for (int i = 0; i < wicketsArray.length; i++) {
				map.put(playerName,new Wicket(wickets, new Bowler(playerName)));
				
			}
			System.out.println("Do you want to add another player(yes/no)");
			loopChoice = sc.nextLine();
		} while(loopChoice.equals("yes"));
		
		do {
			System.out.println("Enter the player name to search");
			playerName = sc.nextLine();
			if(map.containsKey(playerName)) {
				Wicket obj =map.get(playerName);
				System.out.println("Player Name : " +obj.getBowlerobject().getBowlerName());
				System.out.println("Wickets:");
				System.out.println(obj.getPlayerName().replaceAll("\\|", "\n"));
			}
			else {
				System.out.println("No player found with the name " +playerName);
			}
			System.out.println("Do you want to search another player(yes/no)");
			loopChoice = sc.nextLine();
		} while(loopChoice.equals("yes"));
		sc.close();
	}

}
