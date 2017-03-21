package program;

import builderfactory.BiletBuilder;
import builderfactory.IBilet;
import builderfactory.TipBilet;

public class Program {

	public static void main(String[] args) {
		IBilet bilet = new BiletBuilder(TipBilet.business).setBagajCala(true).setDestinatie("Craiova").build();
		System.out.println(bilet.descriere());
	}

}
