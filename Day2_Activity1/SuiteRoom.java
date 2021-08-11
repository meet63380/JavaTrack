/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class SuiteRoom extends HotelRoom{
	private int ratePerSqFeet;

	/**
	 * @param hotelName
	 * @param numberOfSqFeet
	 * @param hasTV
	 * @param hasWifi
	 */
	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=15;
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
