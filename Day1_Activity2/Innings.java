/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class Innings {
	private String teamname, inningsname;
	private int runs;
	public String getTeamName() {
		return this.teamname;
	}
	public void setTeamName(String s) {
		this.teamname = s;
	}
	public String getInningsName() {
		return this.inningsname;
	}
	public void setInningsName(String s) {
		this.inningsname = s;
	}
	public int getRuns() {
		return this.runs;
	}
	public void setRuns(int a) {
		this.runs = a;
	}
	public void displayInningsDetails() {
		if(this.inningsname.equals("First")) {
			System.out.println("Name: " + this.teamname + "\n" + "Scored: " + this.runs);
			System.out.println("Need " + (runs+1) + " to win");	
		}
		else if(this.inningsname.equals("Second")) {
			System.out.println("Name: " + this.teamname + "\n" + "Scored: " + this.runs);
			System.out.println("Match Ended.");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	

}
