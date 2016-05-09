package CoachSim;
//test
public abstract class Player {
	private String position;
	private String playerName;
	private int number;
	
	public Player(){
	}
	
	public Player(String name){
		setName(name);
		setNum(0);
		setPos("");
	}
	
	public Player(int number){
		setNum(number);
		setName("Unknown");
		setPos("");
	}
	
	public Player(String name, int number){
		setNum(number);
		setName(name);
		setPos("");
	}
	
	public Player(String name, int number, String pos){
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
	
	abstract public String toString();
	
	
}
