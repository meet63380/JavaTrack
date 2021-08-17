/**
 * This is done using Thread Class
 */
package javaPractice;

import java.util.Arrays;

/**
 * @author shahm
 *
 */
class SortScore extends Thread {
	private String matchType, scoreString;
	private int[] scores;
	/**
	 * @param matchType
	 * @param scoreString
	 */
	public SortScore(String matchType, String scoreString) {
		this.matchType = matchType;
		this.scoreString = scoreString;
		String[] scoreStringArray=scoreString.split(",");
		this.scores = new int[scoreStringArray.length];
		for (int i = 0; i < scoreStringArray.length; i++) {
			this.scores[i] = Integer.parseInt(scoreStringArray[i]);
		}
	}
	
	



	@Override
	public void run() {
		// TODO Auto-generated method stub
			Arrays.sort(this.scores);
	}
	/**
	 * @return the matchType
	 */
	public String getMatchType() {
		return matchType;
	}
	/**
	 * @param matchType the matchType to set
	 */
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	/**
	 * @return the scoreString
	 */
	public String getScoreString() {
		return scoreString;
	}
	/**
	 * @param scoreString the scoreString to set
	 */
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return scores;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
}
