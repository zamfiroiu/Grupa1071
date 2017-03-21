package program;

import prototype.Avion;

public class Program {

	public static void main(String[] args) {
		try{
			Avion prototip=new Avion(1, "Airbus", "747", 300, 1200, 120);
			System.out.println("Prototip: "+prototip.toString());
			Avion avion2=prototip.clone();
			System.out.println(avion2.toString());
			Avion avion3=prototip.clone();
			System.out.println(avion3.toString());
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}

	}

}
