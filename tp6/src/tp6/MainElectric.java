package tp6;

public class MainElectric {
	public static void main(String[] args) {
		Guitare Guitar[] = new Guitare[8];
		for (int i = 0; i < 3; i++) {
			Guitar[i] = new Guitare("Si", (int) Math.random());
			Guitare play;
			play = Guitar[i];
			play.jouer();
		}
		for (int j = 4; j < 8; j++) {
			Guitar[j] = new GuitareElectriqueBis("Do", (int) Math.random());
			Guitare play;
			play = Guitar[j];
			play.jouer();
		}
	}
}