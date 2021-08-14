/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class Team {
	private String teamName;
	private long numberOfMatches;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	/**
	 * @param teamName
	 * @param numberOfMatches
	 */
	public Team(String teamName, long numberOfMatches) {
		this.teamName = teamName;
		this.numberOfMatches = numberOfMatches;
	}
	@Override
	public String toString() {
		return "" + this.teamName + " - " + this.numberOfMatches;
	}
	

}
