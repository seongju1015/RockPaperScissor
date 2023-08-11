package project.game;
import java.util.Random;

public class Game {
	private int check;
	private String result;
	Random random = new Random();
	
	public void setCheck() {
		check = random.nextInt(3)+1;
	}
	public int getCheck() {
		return check;
	}
	public void setResult() {
		if(check == 1) {
			result = "Rock";
		}
		else if(check == 2) {
			result = "Paper";
		}
		else{
			result = "Scissor";
		}
	}
	public String getCheck() {
		return check;
	}
}
