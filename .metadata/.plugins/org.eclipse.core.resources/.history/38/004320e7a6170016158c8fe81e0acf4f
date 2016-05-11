package CoachSim;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

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
	
	public void save(String fileName) throws FileNotFoundException {
		BaseballTeam bt = new BaseballTeam();
	    PrintWriter pw = new PrintWriter(new FileOutputStream("src/CoachSim/BaseballOutput"));
	        pw.println(bt);
	    pw.close();
	}
}

