/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class CustomAgeExceptionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CustomAgeException {
		// TODO Auto-generated method stub
		int playerAge;
		String playerName;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the player name");
			playerName = sc.nextLine();
			System.out.println("Enter the player age");
			playerAge = Integer.parseInt(sc.nextLine());
			sc.close();
			if(playerAge<19) {
				throw new CustomAgeException("InvalidAgeRangeException");
		
			}
			
			System.out.println("Player name : " +playerName);
			System.out.println("Player age : " +playerAge);
		} catch (CustomAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
