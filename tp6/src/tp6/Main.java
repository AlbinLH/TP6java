package tp6;

public class Main {

	public static void main(String[] args) {
		Guitare Guitar[] = new Guitare[8];
		for (int i = 0; i < 8; i++) {
			Guitar[i] = new Guitare("Si",(int) Math.random());
			Guitare play;
			play = Guitar[i];
			play.jouer();
		}
	}

}
