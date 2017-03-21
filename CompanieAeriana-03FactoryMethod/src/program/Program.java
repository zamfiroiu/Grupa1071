package program;

import factorymethod.Angajat;
import factorymethod.FactoryAngajati;
import factorymethod.FactoryPilot;
import factorymethod.FactoryStewardeza;

public class Program {

	private static void AfisareDescriere(FactoryAngajati fabrica) {
		Angajat angajat = fabrica.getAngajat();
		angajat.descriereAngajat();
	}
	
	public static void main(String[] args) {
		AfisareDescriere(new FactoryStewardeza());
		AfisareDescriere(new FactoryPilot());
		


	}

}
