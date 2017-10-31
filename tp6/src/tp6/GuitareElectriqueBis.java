package tp6;

public class GuitareElectriqueBis extends Guitare implements Instruments{
	
	public GuitareElectriqueBis(String cSon, int cNombreCorde) {
		super(cSon, cNombreCorde);
		this.son = cSon;
		this.nombreCorde = cNombreCorde;
	}

	public void distro() {
		for (int i = 0; i < nombreCorde; i++) {
			System.out.println(son.toUpperCase() + "OUUUIIINNGGG");
	}
	}
	public static void main(String[] args) {
		GuitareElectriqueBis play;
		play = new GuitareElectriqueBis("do", 1);
		play.jouer();
		play.distro();
		play.jouer();

	}

}
