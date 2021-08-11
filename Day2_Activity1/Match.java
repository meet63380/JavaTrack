/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
abstract class Match {
	private int currentscore, target;
	private float currentover;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public abstract float calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunRate, int balls);
	

}
