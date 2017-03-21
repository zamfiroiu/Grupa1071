package abstractfactory;

public class FactoryTransportMarfa implements FactoryTransport {

	@Override
	public TransportPublic getTransportPublic() {
		return new TransportMarfaPublic();
	}

	@Override
	public TransportPrivat getTransportPrivat() {
		return new TransportMarfaPrivat();
	}

}
