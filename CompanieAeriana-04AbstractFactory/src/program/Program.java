package program;

import abstractfactory.FactoryTransport;
import abstractfactory.FactoryTransportPersoane;
import abstractfactory.TransportPrivat;
import abstractfactory.TransportPublic;

public class Program {

	public static void main(String[] args) {

		
		
		FactoryTransport fabrica = new FactoryTransportPersoane();
		TransportPublic transport=fabrica.getTransportPublic();
		TransportPrivat transportPrivat=fabrica.getTransportPrivat();

		System.out.println(transport.getDescriere());
		System.out.println(transportPrivat.getDescriere());
	}

}
