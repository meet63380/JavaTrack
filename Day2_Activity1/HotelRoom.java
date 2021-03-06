/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class HotelRoom {
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV, hasWifi;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	/**
	 * @param hotelName
	 * @param numberOfSqFeet
	 * @param hasTV
	 * @param hasWifi
	 */
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public int calculateTariff() {
		return this.numberOfSqFeet * getRatePerSqFeet();
		
	}
	public int getRatePerSqFeet() {
		return 0;
	}

}
