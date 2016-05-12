package CoachSim;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
	private List<Player> players;
	private String name;
	
	public Team(){
		setName("My Team");
		createList();
	}
	
	public Team(String name){
		setName(name);
		createList();
	}
	
	public Team(String name, List<Player> players){
		setPlayers(players);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPlayers(List<Player> players){
		this.players = players;
	}
	
	public void createList(){
		players = new ArrayList<Player>();
	}
	
	public String getName(){
		return name;
	}
	
	public int getSize(){
		return players.size();
	}
	
	public void addPlayer(Player p){
		players.add(p);
	}

	@Override
	public String toString() {
		String output = "";
		output += name + "\n\nPlayer Info:\n";		
		
		for(int i = 0; i < players.size(); i++)
			output += players.get(i) + "\n\n";
		
		return output;
	}
}
