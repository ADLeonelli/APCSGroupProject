package CoachSim;

public interface Statable {
	
	public int compareStats(Object obj);
	
	public String getStats();
	
	public void addStat(Stat s);
	
	public void addStat(int n, Stat s);
	
}
