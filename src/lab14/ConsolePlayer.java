package lab14;

import java.util.Scanner;

public class ConsolePlayer extends Players {
	
	private Scanner scnr;
	
	public ConsolePlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
		
	}
	

	@Override
	public Roshambo generateRoshambo() {
		
		String choice = Validator.getString(scnr, "Rock, Paper, or Scissors: ");
		
		choice = choice.toLowerCase();
		if (choice.startsWith("r")) {
			return Roshambo.ROCK;
		}else if (choice.startsWith("p")) {
			return Roshambo.PAPER;
		}else if (choice.startsWith("s")) {
			return Roshambo.SCISSORS;
		}else {
			System.out.println("That was an invalid choice. Try Again. ");
			return generateRoshambo();
	}

	}
}
