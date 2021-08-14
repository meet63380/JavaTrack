/**
 * 
 */
package javaTrack;
import java.util.*;
import java.util.Map.Entry;
/**
 * @author shahm
 *
 */
class DisplayTeam2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int noOfInputs = Integer.parseInt(sc.nextLine());
		
		Map<String, Team2> map = new TreeMap<>();
		for (int i = 0; i < noOfInputs; i++) {
			String line = sc.nextLine();
			String[] lineArray = line.split("\\|");
			if (map.containsKey(lineArray[0])) {
				Team2 obj = map.get(lineArray[0]);
				obj.addPlayer(lineArray[1]);
			}
			else {
				Team2 obj = new Team2(lineArray[0]);
				obj.addPlayer(lineArray[1]);
				map.put(lineArray[0], obj);
			}
		}
		System.out.println("Team and Players in ascending order");
		for (Entry<String, Team2> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			//Collections.sort(entry.getValue().getPlayerList());
			for (Player2 playerName : entry.getValue().getPlayerList()) {
				System.out.println("--"+playerName.getPlayerName());
			}
			
		}
		
		sc.close();

	}

}
