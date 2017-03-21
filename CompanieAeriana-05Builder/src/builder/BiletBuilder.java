package builder;

public class BiletBuilder implements IBuilder {

	private Bilet bilet;
	
	public BiletBuilder() {
		bilet=new Bilet("");
	}
	
	@Override
	public Bilet build() {
		return bilet;
	}

	@Override
	public IBuilder setDestinatie(String destinatie) {
		bilet.setDestinatie(destinatie);
		return this;
	}

	@Override
	public IBuilder setLoc(String loc) {
		bilet.setLoc(loc);
		return this;
	}

	@Override
	public IBuilder setBagajCala(boolean bagajCala) {
		bilet.setBagajCala(bagajCala);
		return this;
	}

	@Override
	public IBuilder setServireMasa(boolean servireMasa) {
		bilet.setServireMasa(servireMasa);
		return this;
	}

}
