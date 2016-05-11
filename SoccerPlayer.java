package CoachSim;

import java.util.ArrayList;

public class SoccerPlayer extends Player implements Statable{
	
	private ArrayList<SoccerStat> stats;

	
	public SoccerPlayer(){
		super();
	}
	
	public SoccerPlayer(String name){
		super(name);
	}
	
	public SoccerPlayer(int number){

		super(number);
	}
	
	public SoccerPlayer(String name, int number){
		super(name, number);
	}
	
	public SoccerPlayer(String name, int number, String pos){
		super(name, number, pos);
	}
	
	@Override
	public int compareStats(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStats() {
		// TODO Auto-generated method stub
		return stats.toString();
	}

	@Override
	public void addStat(Stat s) {
		// TODO Auto-generated method stub
		SoccerStat ss = (SoccerStat)s;
		
		stats.add(ss);
	}

	@Override
	public void addStat(int n, Stat s) {
		// TODO Auto-generated method stub
		SoccerStat ss = (SoccerStat)s;
		
		stats.add(n, ss);
	}
	
	@Override
	public String toString() {
		return "Player Info::\nName::"+getName()+"\nNumber::"+getNumber()+"\nPosition::"+getPos() + "\nStats:: " + getStats();
	}


}
