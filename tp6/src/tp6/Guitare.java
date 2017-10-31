package tp6;

public class Guitare implements Instruments {
	public int nombreCorde;
	public String son;

	public Guitare(String cSon, int cNombreCorde) {
		this.son = cSon;
		this.nombreCorde = cNombreCorde;
	}

	public void jouer() {
		for (int i = 0; i < nombreCorde; i++) {
			System.out.println(son);
		}
	}

	public static void main(String[] args) {
		Guitare play;
		play = new Guitare("do", 10);
		play.jouer();

	}
}
