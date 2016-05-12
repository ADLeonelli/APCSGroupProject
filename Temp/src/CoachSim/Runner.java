package CoachSim;

import java.io.FileNotFoundException;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {

		BaseballTeam test = new BaseballTeam();
		test.populate();
		System.out.println(test);
		test.save();
	}

}
