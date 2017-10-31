package tp6;

public interface Instruments {
	public class Instrus {
		public String notes;

		public Instrus(String cNotes) {
			this.notes = cNotes;
		}

		public void jouerInstru() {
			System.out.println(notes);
		}

		public static void main(String[] args) {
			Instrus symphony;
			symphony = new Instrus("do");
			symphony.jouerInstru();
		}
	}
}