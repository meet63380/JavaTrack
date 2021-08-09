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
	public static int calculateSal( int salary, int shifts ) {
		
		int saving = (int)(salary - salary*0.2 - salary*0.3 + salary*0.02*shifts);
		return saving;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0;
		int noOfShifts=0;
		
		Scanner sc = new Scanner(System.in);
		salary=sc.nextInt();
		sc.nextLine();
		String line=sc.nextLine();
		if(!line.isBlank()) {
			noOfShifts=Integer.parseInt(line);
		}
		
		if ( salary > 8000) {
			System.out.println("Salary too large");
		}
		else if(noOfShifts < 0) {
			System.out.println("Shifts too small");
		}
		else if(salary < 0) {
			System.out.println("Salary too small");
		}
		else {
			System.out.println(calculateSal(salary, noOfShifts));
		}
	}

}
