package simplefactory;

public class AvionMarfa implements Avion {

	@Override
	public void descriere() {
		System.out.println("Avion de marfa");

	}

	@Override
	public String descriereAvion() {
		return "Avion de marfa";
	}

}
