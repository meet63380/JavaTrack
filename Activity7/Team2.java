/**
 * This is done using Comparator with lambda expression
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
		//playerList.sort(Comparator.comparing(p2 -> p2.getPlayerName()));
		playerList.sort((Player2 p1, Player2 p2) -> p1.getPlayerName().compareTo(p2.getPlayerName()));
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
