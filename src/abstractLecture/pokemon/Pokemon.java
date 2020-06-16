package abstractLecture.pokemon;

abstract class Pokemon {
	
	int hp;
	String name;
	String trainer;
	
	public Pokemon() {
	
	}
	
	public Pokemon(int hp, String name, String trainer) {
		this.hp = hp;
		this.name = name;
		this.trainer = trainer;
	}
	
	public abstract void attack();
	
}
