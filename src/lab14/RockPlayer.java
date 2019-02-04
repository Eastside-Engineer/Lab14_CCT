package lab14;

public class RockPlayer extends Players {

	public RockPlayer() {
		super();
	}

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {

		return Roshambo.ROCK;
	}

}
