/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class VehicleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String make, vehicleNumber, fuelType = null;
		int fuelCapacity, cc;
		
		System.out.println("1.1.Four Wheeler \n2.Two Wheeler \nEnter Vehicle Type:");
		int vehicleTypeChoice = sc.nextInt();
		sc.nextLine();
		if(vehicleTypeChoice !=1 && vehicleTypeChoice!=2) {
			System.exit(0);
		}
		
		System.out.println("Vehicle Make:");
		make = sc.nextLine();
		System.out.println("Vehicle Number:");
		vehicleNumber = sc.nextLine();
		System.out.println("Fuel Type: \n1.Petrol \n2.Diesel");
		fuelType = (sc.nextInt() == 1)? "Petrol" : "Diesel";
		System.out.println("Fuel Capacity:");
		fuelCapacity = sc.nextInt();
		sc.nextLine();
		System.out.println("Engine CC:");
        cc = sc.nextInt();
        sc.nextLine();
        
        if(vehicleTypeChoice == 1) {
        	System.out.println("Audio System");
            String audioSystem = sc.nextLine();
            System.out.println("Number of Doors:");
            int numberOfDoors = sc.nextInt();
            FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
            fw.displayDetailInfo();
        }
        else if(vehicleTypeChoice == 2) {
       
        	System.out.println("Kick Start Available(yes/no):");
        	boolean kickStartAvailable = (sc.nextLine().equals("yes"))? true : false;
        	TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
        	tw.displayDetailInfo();
        }
        else {
        	System.out.println("Invalid Choice");
        	System.exit(0);
        }
		
		sc.close();

	}

}
