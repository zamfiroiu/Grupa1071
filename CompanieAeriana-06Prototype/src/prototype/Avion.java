package prototype;

public class Avion implements IAvion {
	private int id;
	private String companieProducatoare;
	private String model;
	private int numarLocuri;
	private double greutate;
	private double lungime;

	public Avion clone() {

		Avion avion = null;
		try {
			avion = new Avion();
			avion.id = this.id;
			avion.companieProducatoare = this.companieProducatoare;
			avion.model = this.model;
			avion.numarLocuri = this.numarLocuri;
			avion.greutate = this.greutate;
			avion.lungime = this.lungime;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return avion;
	}

	public Avion() throws Exception {

	}

	public Avion(int id, String companieProducatoare, String model, int numarLocuri, double greutate, double lungime)
			throws Exception {
		super();
		this.id = id;
		this.companieProducatoare = companieProducatoare;
		this.model = model;
		if (numarLocuri > 0 && numarLocuri < 1000) {
			this.numarLocuri = numarLocuri;
		} else {
			throw new Exception("Numar locuri incorect");
		}
		if (greutate > 1000 && greutate < 10000) {
			this.greutate = greutate;
		} else {
			throw new Exception("Greutate incorecta");
		}
		if (lungime > numarLocuri / 3) {
			this.lungime = lungime;
		} else {
			throw new Exception("Lungime incorecta");
		}
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", companieProducatoare=" + companieProducatoare + ", model=" + model
				+ ", numarLocuri=" + numarLocuri + ", greutate=" + greutate + ", lungime=" + lungime + "]";
	}

}
