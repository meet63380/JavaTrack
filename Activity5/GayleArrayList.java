/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class GayleArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int halfCenturyCount = 0, centuryCount = 0;
		ArrayList<Integer> gayleScores = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		
		int numOfMatches = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < numOfMatches; i++) {
			gayleScores.add(Integer.parseInt(sc.nextLine()));
		}
		sc.close();
		for (int score:gayleScores) {
			if(score>=100) {
				centuryCount++;
			}
			else if(score>=50) {
				halfCenturyCount++;
			}
		}
		System.out.println(halfCenturyCount);
		System.out.println(centuryCount);

	}

}
