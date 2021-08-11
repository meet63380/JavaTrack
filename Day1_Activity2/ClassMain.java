/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class ClassMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer cust = new Customer();
		System.out.println("Enter the details: ");
		String[] details = sc.nextLine().split(",");
		cust.setName(details[0]);
		cust.setAddress(details[1]);
		cust.setMobile(details[2]);
		
		System.out.println("Name: " + cust.getName());
		System.out.println("Address: " + cust.getAddress());
		System.out.println("Mobile: " + cust.getMobile());
		
		sc.close();

	}

}
