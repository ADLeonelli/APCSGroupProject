package CoachSim;

public class SoccerPlayer extends Player{
	private String position;
	
	public SoccerPlayer(){
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
		super(name, number);
		setPos(pos);
	}
	
	public void setPos(String pos){
		position = pos;
	}
	
	public String getPos(){
		return position;
	}

	@Override
	public String toString() {
		return super.toString() + " " + "SoccerPlayer [position=" + position + "]";
	}
	
	
}
