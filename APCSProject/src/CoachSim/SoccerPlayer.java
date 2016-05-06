package CoachSim;

public class SoccerPlayer implements Player{
	private String position;
	private String playerName;
	private int number;
	
	public SoccerPlayer(){
	}
	
	public SoccerPlayer(String name){
		setName(name);
		setNum(0);
		setPos("");
	}
	
	public SoccerPlayer(int number){
		setNum(number);
		setName("Unknown");
		setPos("");
	}
	
	public SoccerPlayer(String name, int number){
		setNum(number);
		setName(name);
		setPos("");
	}
	
	public SoccerPlayer(String name, int number, String pos){
		setName(name);
		setNum(number);
		setPos(pos);
	}
	
	public void setName(String name){
		playerName = name;
	}
	
	public void setNum(int num){
		number=num;
	}
	
	public void setPos(String pos){
		position = pos;
	}
	
	public String getName(){
		return playerName;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getPos(){
		return position;
	}

	@Override
	public String toString() {
		return "Player Info::/nName::"+getName()+"/nNumber::"+getNumber()+"/nPosition::"+getPos();
	}


	
}
