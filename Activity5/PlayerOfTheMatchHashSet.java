/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class PlayerOfTheMatchHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfMatches;
		HashSet<String> players = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		numOfMatches = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numOfMatches; i++) {
			players.add(sc.nextLine());
		}
		System.out.println(players.size());
		sc.close();

	}

}
