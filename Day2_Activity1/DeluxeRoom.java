/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=10;
	}

	@Override
	public int getRatePerSqFeet() {
		// TODO Auto-generated method stub
		if(this.isHasWifi()) {
			return this.ratePerSqFeet+2;
		}
		else {
			return this.ratePerSqFeet;
		}
		
	}
	
	
	

}
