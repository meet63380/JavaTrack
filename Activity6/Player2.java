/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class Player2 implements Comparable<Player2>{
	private String playerName;
	
	/**
	 * @param playerName
	 */
	public Player2(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public int compareTo(Player2 o) {
		// TODO Auto-generated method stub
		return this.playerName.compareTo(o.getPlayerName());
	}

}
