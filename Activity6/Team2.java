/**
 * 
 */
package javaTrack;

import java.util.*;

/**
 * @author shahm
 *
 */
class Team2{
	private String teamName;
	private List<Player2> playerList = new ArrayList<Player2>();
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Player2> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List<Player2> playerList) {
		this.playerList = playerList;
	}
	/**
	 * @param teamName
	 */
	public Team2(String teamName) {
		this.teamName = teamName;
	}
	public void addPlayer (String playerName) {
		playerList.add(new Player2(playerName));
	}
	
	
	
	
	

}
