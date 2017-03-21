package program;

import simplefactory.Avion;
import simplefactory.FactoryAvion;
import simplefactory.TipAvion;

public class Program {

	public static void main(String[] args) {
		FactoryAvion fabricaAvioane = new FactoryAvion();
		
		Avion avion = fabricaAvioane.getAvion(TipAvion.avionPersoane);
		
		System.out.println(avion.descriereAvion());
		
	}

}
