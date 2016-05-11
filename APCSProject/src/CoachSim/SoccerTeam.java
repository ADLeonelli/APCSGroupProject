package CoachSim;

import java.io.*;

public class SoccerTeam extends Team{
	
	public SoccerTeam(){
		super();
	}
	
	public SoccerTeam(String name){
		super(name);
	}
	
	public void addSoccerPlayer(String name, int number, String pos){
		super.addPlayer(new SoccerPlayer(name, number, pos));
	}
	
	public void save(String fileName) throws FileNotFoundException {
		SoccerTeam st = new SoccerTeam();
	    PrintWriter pw = new PrintWriter(new FileOutputStream("src/CoachSim/Output"));
	        pw.println(st);
	    pw.close();
	}
	
}
