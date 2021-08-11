/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;
	

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	/**
	 * @param make
	 * @param vehicleNumber
	 * @param fuelType
	 * @param fuelCapacity
	 * @param cc
	 */
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.kickStartAvailable = kickStartAvailable;
	}


	@Override
	public void displayDetailInfo() {
		// TODO Auto-generated method stub
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		if(this.kickStartAvailable) {
			System.out.println("Kick Start Available:"+"YES");
		}
		else {
			System.out.println("Kick Start Available:"+"NO");
		}
	}

}
