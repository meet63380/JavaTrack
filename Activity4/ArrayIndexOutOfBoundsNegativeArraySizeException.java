/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class ArrayIndexOutOfBoundsNegativeArraySizeException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfOvers, overNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of overs");
		try {
			numberOfOvers = Integer.parseInt(sc.nextLine());
			int[] arr = new int[numberOfOvers];
			
			System.out.println("Enter the number of runs for each over");
			for (int i =0; i < numberOfOvers; i++) {
				arr[i] = Integer.parseInt(sc.nextLine());
			}
			
			System.out.println("Enter the over number");
			overNumber = Integer.parseInt(sc.nextLine());
			
			System.out.println("Runs scored in this over :" +arr[overNumber-1]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass());
		}
		
		sc.close();
	}

}
