/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Address: ");
		emp.setAddress(sc.nextLine());
		System.out.println("Enter Mobile: ");
		emp.setMobile(sc.nextLine());
		
		System.out.printf("Name: %s\nAddress: %s\nMobile: %s",emp.getName(),emp.getAddress(),emp.getMobile());
		sc.close();
	}

}
