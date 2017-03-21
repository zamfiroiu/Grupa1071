package simplefactory;

public class AvionPersoane implements Avion {

	@Override
	public void descriere() {
		System.out.println("Avion de persoane");
	}

	@Override
	public String descriereAvion() {
		return "Avion de persoane";
	}

}
