package lab14;

import java.util.Random;

import lab14.Players;

public class RandomPlayer extends Players {
	public Roshambo whoKnew;
	Random rand = new Random();

	@Override
	public Roshambo generateRoshambo() {
		int x = rand.nextInt(3) + 1;
		switch (x) {
		case 1:
			whoKnew = Roshambo.ROCK;
			break;
		case 2:
			whoKnew = Roshambo.PAPER;
			break;
		case 3:
			whoKnew = Roshambo.SCISSORS;
			break;
		default:
			whoKnew = Roshambo.PAPER;
		}
		return whoKnew;
	}

	public RandomPlayer() {
	}
}

