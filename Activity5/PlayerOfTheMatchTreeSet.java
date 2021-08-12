/**
 * 
 */
package javaTrack;

import java.util.*;

/**
 * @author shahm
 *
 */
class PlayerOfTheMatchTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfMatches;
		TreeSet<String> players = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		numOfMatches = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numOfMatches; i++) {
			players.add(sc.nextLine());
		}
		sc.close();
		for (String playerName:players) {
			System.out.println(playerName);
		}
	}

}
