package CoachSim;

public class SoccerStat extends Stat {
	
	private String stat;

	
	public SoccerStat() {
		super(" ");
		
	}
	
	public SoccerStat(String stat) {
		super();
		this.stat = stat;
	}

	public int isGoal(){
		if(stat.equals("G"))
			return 1;
		
		else 
			return 0;
	}
	
	public int isShot(){
		if(stat.equals("S") || stat.equals("G"))
			return 1;
		else
			return 0;
	}
	public int Assist(){
		if(stat.equals("A"))
			return 1;
		else
			return 0;
	}
	
	public int isCorner(){
		if(stat.equals("C"))
			return 1;
		else
			return 0;
	}
	
	public int isFoul(){
		if(stat.equals("F"))
			return 1;
		else
			return 0;
	}
	
	public int isRed(){
		if(stat.equals("RC"))
			return 1;
		else
			return 0;
	}
	
	public int isYellow(){
		if(stat.equals("YC"))
			return 1;
		else
			return 0;
	}
		

	
	public String getStat(){
		return stat;
	}
	
	public String toString(){
		
		return getStat() + "\n";
		
	}
	
}
