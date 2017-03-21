package builderfactory;

public abstract class IBilet {
	private String destinatie;
	private String loc;
	private boolean bagajCala;
	private boolean servireMasa;
	
	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public boolean isBagajCala() {
		return bagajCala;
	}

	public void setBagajCala(boolean bagajCala) {
		this.bagajCala = bagajCala;
	}

	public boolean isServireMasa() {
		return servireMasa;
	}

	public void setServireMasa(boolean servireMasa) {
		this.servireMasa = servireMasa;
	}


	public IBilet() {
		super();
	}

	public abstract String descriere();

}
