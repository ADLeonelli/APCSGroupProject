package CoachSim;

public class BaseballStat extends Stat{
	
	private String hit;
	
	public BaseballStat(){
		super();
	}
	public BaseballStat(String hit) {
		super();
		this.hit = hit;
	}
	
	public String getHit(){
		return hit;
	}
	
	public int isHit(){
		if(hit.equals("O")|| hit.equals("E"))
			return 0;
		else return 1;
	}
	
	public int isAB(){
		if(hit.equals("BB") || hit.equals("HBP"))
			return 0;
		else return 1;
	}
	
	public int getBases(){
		
		int bases =0;
		
		if(hit.equals("HR"))
			return 4;
		if(hit.equals("T"))
			return 3;
		if(hit.equals("D"))
			return 2;
		if(hit.equals("S"))
			return 1;
		
		
		return bases;
	}
	
	public String toString(){
		return  "Bases: " + getBases() +" Hit: " + getHit();
	}
	
}
