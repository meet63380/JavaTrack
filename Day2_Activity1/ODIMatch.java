package javaTrack;

/**
 * @author shahm
 *
 */

class ODIMatch extends Match {

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
		int odiBalls = 300;
		int balls = odiBalls - ((int) this.getCurrentover() * 6);
		return balls;
	}

	@Override
	public void display(double reqRunRate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Requirements:");
        System.out.println("Need " + (this.getTarget() - this.getCurrentscore()) + " runs in " + balls + " balls");
        System.out.printf("Required Runrate: %.2f", reqRunRate);
		
	}

}
