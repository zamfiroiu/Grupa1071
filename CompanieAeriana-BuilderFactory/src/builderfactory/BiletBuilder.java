package builderfactory;

public class BiletBuilder implements IBuilder {

	IBilet bilet;
	
	public BiletBuilder(TipBilet tipBilet){
		switch(tipBilet){
		case business:  bilet=new BiletBusiness();break;
		case economic: bilet=new BiletEconomic();break;
		default: bilet=null;
		}
	}
	
	@Override
	public IBilet build() {
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
