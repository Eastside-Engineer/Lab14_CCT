package lab14;

public abstract class Players {
//Abstract class that everything is based off of
	private String name;
	
	public abstract Roshambo generateRoshambo();

	public Players () {
		
	}
	
	public Players(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
}
