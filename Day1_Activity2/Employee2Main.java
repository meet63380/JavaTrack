/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Employee2Main {

	/**
	 * @param args
	 */
	private static void showDetails(Employee2 emp) {
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Mobile: " + emp.getMobile());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee2 emp = new Employee2();
		System.out.println("Enter the name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Address: ");
		emp.setAddress(sc.nextLine());
		System.out.println("Enter mobile: ");
		emp.setMobile(sc.nextLine());
		
		System.out.println("Employee Details");
		showDetails(emp);
		System.out.println("Verify and Update the details:");
		updationMenu(emp);
		
		sc.close();

	}

	private static void updationMenu(Employee2 emp) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu");
			System.out.println("1.Update Employee name");
			System.out.println("2.Update Employee Address");
			System.out.println("3.Update Employee mobile");
			System.out.println("4.All information correct/Exit");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: {
				System.out.println("Current name is: " + emp.getName());
				System.out.println("Enter the name: ");
				emp.setName(sc.nextLine());
				break;
			}
			case 2: {
				System.out.println("Current address is: " + emp.getAddress());
				System.out.println("Enter the address: ");
				emp.setAddress(sc.nextLine());
				break;
				
			}
			case 3: {
				System.out.println("Current mobile is: " + emp.getMobile());
				System.out.println("Enter the mobile: ");
				emp.setMobile(sc.nextLine());
				break;
				
			}
			case 4: {
				break;
			}
			default: {
				System.out.println("Enter a valid choice");
				break;
			}
			}
		} while(choice!=4);
		System.out.println("The details are:");
		showDetails(emp);
		sc.close();
		
	}

}
