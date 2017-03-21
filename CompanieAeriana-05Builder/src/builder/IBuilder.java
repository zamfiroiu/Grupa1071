package builder;

public interface IBuilder {

	Bilet build();
	IBuilder setDestinatie(String destinatie);
	IBuilder setLoc(String loc);
	IBuilder setBagajCala(boolean bagajCala);
	IBuilder setServireMasa(boolean servireMasa);	
}
