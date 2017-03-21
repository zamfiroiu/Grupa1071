package factorymethod;

public class FactoryStewardeza implements FactoryAngajati {

	@Override
	public Angajat getAngajat() {
		return new Stewardeza();
	}

}
