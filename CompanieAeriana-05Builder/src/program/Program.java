package program;

import builder.Bilet;
import builder.BiletBuilder;
import builder.BiletBuilderV2;

public class Program {

	public static void main(String[] args) {
		Bilet bilet=new Bilet("Iasi");
		bilet.setLoc("7E");
		bilet.setServireMasa(true);
		bilet.setBagajCala(true);
		
		System.out.println(bilet.toString());
		
		//prin builder
		Bilet bilet2 = new BiletBuilderV2().setDestinatie("Cluj").setLoc("8A").setServireMasa(true).build();
		System.out.println(bilet2.toString());
		
	}

}















