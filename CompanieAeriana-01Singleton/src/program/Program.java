package program;

import lazyinitialization.Companie;

public class Program {

	public static void main(String[] args) {
		Companie companie1 = Companie.createInstance("Companie", 123);
		Companie companie2 = Companie.createInstance("Companie2", 987);
		
		System.out.println(companie1.toString());
		System.out.println(companie2.toString());
	}

}
