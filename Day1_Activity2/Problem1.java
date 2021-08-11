/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String firstName, lastName;
		firstName = sc.nextLine();
		lastName = sc.nextLine();
		
		firstName = firstName.toLowerCase();
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
		lastName = lastName.toUpperCase();
		System.out.println(firstName + " " + lastName);
		sc.close();

	}

}
