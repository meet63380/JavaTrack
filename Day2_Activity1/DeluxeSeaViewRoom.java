/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class DeluxeSeaViewRoom extends DeluxeRoom{

	/**
	 * @param hotelName
	 * @param numberOfSqFeet
	 * @param hasTV
	 * @param hasWifi
	 */
	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=12;
	}
	
	
	

}
