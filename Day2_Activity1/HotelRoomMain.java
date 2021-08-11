/**
 * 
 */
package javaTrack;
import java.util.*;

/**
 * @author shahm
 *
 */
class HotelRoomMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String hotelName;
		int numberOfSqFeet;
		boolean hasTV, hasWifi;
		
		System.out.println("Hotel Tariff Calculator\n"
				+ "1. Deluxe Room\n"
				+ "2. Deluxe AC Room\n"
				+ "3. Suite AC Room\n"
				+ "Select Room Type:");
		int roomTypeChoice = sc.nextInt();
		sc.nextLine();
		System.out.println("Hotel Name:");
		hotelName = sc.nextLine();
		System.out.println("Room Square Feet Area:");
		numberOfSqFeet = sc.nextInt();
		sc.nextLine();
		System.out.println("Room has TV (yes/no):");
		hasTV = (sc.nextLine().equals("yes"))? true : false;
		System.out.println("Room has Wifi (yes/no):");
		hasWifi = (sc.nextLine().equals("yes"))? true : false;
		System.out.print("Room Tariff per day is:");
		switch(roomTypeChoice) {
		case 1: {
			DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.print(dr.calculateTariff());
			break;
		}
		case 2: {
			DeluxeSeaViewRoom dsvr = new DeluxeSeaViewRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.print(dsvr.calculateTariff());
			break;
			
		}
		case 3: {
			SuiteRoom sr = new SuiteRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.print(sr.calculateTariff());
			break;	
		}
		default: {
			System.out.println("Enter a valid choice");
			break;
		}
		
		}
		sc.close();
	}

}
