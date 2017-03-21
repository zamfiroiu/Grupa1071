package abstractfactory;

public class FactoryTransportPersoane implements FactoryTransport {

	@Override
	public TransportPublic getTransportPublic() {
		return new TransportPersoanePublic();
	}

	@Override
	public TransportPrivat getTransportPrivat() {
		return new TransportPersoanePrivat();
	}

}
