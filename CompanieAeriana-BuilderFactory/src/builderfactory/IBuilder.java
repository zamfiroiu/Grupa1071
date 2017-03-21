package builderfactory;


public interface IBuilder {

	IBilet build();
	
	IBuilder setDestinatie(String destinatie);
	IBuilder setLoc(String loc);
	IBuilder setBagajCala(boolean bagajCala);
	IBuilder setServireMasa(boolean servireMasa);

}
