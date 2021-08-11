/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class TestMatch extends Match {


	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		float reqRun = this.getTarget()-this.getCurrentscore();
		float reqRunRate = (reqRun / this.calculateBalls()) * 6;
		return reqRunRate;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		int testBalls = 540;
		int balls = testBalls - ((int) this.getCurrentover() * 6);
		return balls;
	}

	@Override
	public void display(double reqRunRate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Requirements:");
        System.out.println("Need " + (this.getTarget() - this.getCurrentscore()) + " runs in " + balls + " balls");
        System.out.printf("Required Runrate: %.2f", reqRunRate);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
