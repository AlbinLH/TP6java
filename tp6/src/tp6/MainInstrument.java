package tp6;

public class MainInstrument implements Instruments{
	public static void main(String[] args) {
		Instrus Instrutab[] = new Instrus[8];
		for (int i = 0; i < 8; i++) {
			Instrutab[i] = new Instrus("Si");
			Instrus symphony;
			symphony = Instrutab[i];
			symphony.jouerInstru();
		}
	}

}
