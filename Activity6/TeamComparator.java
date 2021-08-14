/**
 * 
 */
package javaTrack;

import java.util.Comparator;

/**
 * @author shahm
 *
 */
class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getNumberOfMatches() - o2.getNumberOfMatches());
	}

}
