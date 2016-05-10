package CoachSim;

public class SoccerPlayer extends Player implements Statable{
	
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
	public String toString() {
		return "Player Info::/nName::"+getName()+"/nNumber::"+getNumber()+"/nPosition::"+getPos();
	}

	@Override
	public int compareStats() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStats() {
		// TODO Auto-generated method stub
		return null;
	}
}
