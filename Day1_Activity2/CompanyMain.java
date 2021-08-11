/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class CompanyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Company comp = new Company();
		System.out.println("Enter the company name: ");
		comp.setName(sc.nextLine());
		System.out.println("Enter the employees: ");
		comp.setEmployees(sc.nextLine());
		System.out.println("Enter TeamLead: ");
		comp.setTeamlead(sc.nextLine());
		
		String[] empNames = comp.getEmployees().split(",");
		String teamLead = comp.getTeamlead();
		boolean teamLeadInTeam = false;
		for (String member:empNames) {
			if(member.equals(teamLead)) {
				teamLeadInTeam =true;
			}
		}
		if(teamLeadInTeam) {
			System.out.println("Name: " +comp.getName());
			System.out.println("Employees: "+comp.getEmployees());
			System.out.println("Lead: "+comp.getTeamlead());
		}
		else {
			System.out.println("Invalid Input");
			
		}
	}
}
