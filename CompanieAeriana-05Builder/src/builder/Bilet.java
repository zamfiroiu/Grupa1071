package builder;

public class Bilet {
	
	private String destinatie;
	private String loc;
	private boolean bagajCala;
	private boolean servireMasa;
	
	public Bilet(String destinatie) {
		super();
		this.destinatie = destinatie;
		this.loc = "1A";
		this.bagajCala = false;
		this.servireMasa = false;
	}

	public Bilet(String destinatie, String loc, boolean bagajCala, boolean servireMasa) {
		super();
		this.destinatie = destinatie;
		this.loc = loc;
		this.bagajCala = bagajCala;
		this.servireMasa = servireMasa;
	}

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

	@Override
	public String toString() {
		return "Bilet [destinatie=" + destinatie + ", loc=" + loc + ", bagajCala=" + bagajCala + ", servireMasa="
				+ servireMasa + "]";
	}
	
	

}
