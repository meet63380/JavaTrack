/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class FourWheeler extends Vehicle {
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	private String audioSystem;
	private int numberOfDoors;
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	@Override
	public void displayDetailInfo() {
		// TODO Auto-generated method stub
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		System.out.println("Audio System:"+this.audioSystem);
		System.out.println("Number of Doors:"+this.numberOfDoors);
	}
	
	

}
