package simplefactory;

public class FactoryAvion {

	public Avion getAvion(TipAvion tipAvion) {
		if(tipAvion == TipAvion.avionMarfa){
			return new AvionMarfa();
		} else {
			return new AvionPersoane();
		}		
	}
}
