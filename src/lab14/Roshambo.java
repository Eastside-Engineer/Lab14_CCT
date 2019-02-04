package lab14;

import lab14.Roshambo;

public enum Roshambo {

	ROCK, PAPER, SCISSORS;
	
	public String toString(String name, Roshambo whoKnew) {
		return name + " played " + whoKnew;
}
}