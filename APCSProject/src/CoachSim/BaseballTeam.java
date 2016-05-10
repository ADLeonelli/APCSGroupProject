package CoachSim;

public class BaseballTeam extends Team{
	
	public BaseballTeam(){
		super();
	}
	
	public BaseballTeam(String name){
		super(name);
	}
	
	public void addBaseballPlayer(String name, int number, String pos){
		super.addPlayer(new BaseballPlayer(name, number, pos));
	}
}

