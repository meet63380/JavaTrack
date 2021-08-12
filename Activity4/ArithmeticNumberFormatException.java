/**
 * 
 */
package javaTrack;
import java.io.*;
/**
 * @author shahm
 *
 */
class ArithmeticNumberFormatException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int runsScored, oversFaced;
		float runRate;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total runs scored");
		try {
			runsScored = Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			oversFaced = Integer.parseInt(br.readLine());
			runRate = (float)runsScored / oversFaced;
			System.out.printf("Current Run Rate :%.2f",runRate);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass());
		}
		
		

	}

}
