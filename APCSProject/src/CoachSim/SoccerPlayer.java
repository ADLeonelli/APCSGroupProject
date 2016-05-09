package CoachSim;

public class SoccerPlayer extends Player{
	private String position;
	private String playerName;
	private int number;
	
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


	
}
