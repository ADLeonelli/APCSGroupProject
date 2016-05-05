package CoachSim;

public class Test {

	private String name;
	private int num;
	
	public Player(){	
	}
	
	public Player(String n){
		setName(n);
		setNum(0);
	}
	
	public Player(int number) {
		setNum(number);
		setName("Player");
	}
	
	public Player(String n, int number) {
		setNum(number);
		setName(n);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setNum(int number){
		num = number;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNum(){
		return num;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", num=" + num + "]";
	}


}
