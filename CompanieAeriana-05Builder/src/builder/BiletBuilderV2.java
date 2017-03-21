package builder;

public class BiletBuilderV2 implements IBuilder {

	private String destinatie;
	private String loc;
	private boolean bagajCala;
	private boolean servireMasa;

	public BiletBuilderV2() {

	}

	@Override
	public Bilet build() {
		Bilet bilet = new Bilet(destinatie, loc, bagajCala, servireMasa);
		return bilet;
	}

	@Override
	public IBuilder setDestinatie(String destinatie) {
		this.destinatie = destinatie;
		return this;
	}

	@Override
	public IBuilder setLoc(String loc) {
		this.loc = loc;
		return this;
	}

	@Override
	public IBuilder setBagajCala(boolean bagajCala) {
		this.bagajCala = bagajCala;
		return this;
	}

	@Override
	public IBuilder setServireMasa(boolean servireMasa) {
		this.servireMasa = servireMasa;
		return this;
	}

}
