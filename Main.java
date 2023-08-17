package project.game;
import project.game.Game;
import project.game.User;
import project.game.HelpPage;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.run();

	}
	
	void run() {
		Game g = new Game();
		User u = new User();
		HelpPage h = new HelpPage();
		Scanner s = new Scanner(System.in);
		int number = 0;
		
		while(true) {
			number = h.setPage(s.nextInt());
		}
	}

}
