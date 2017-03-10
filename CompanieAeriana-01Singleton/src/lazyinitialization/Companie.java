package lazyinitialization;

public class Companie {
	private String nume;
	private int CUI;
	
	private static Companie instanta = null;
	
	public static Companie createInstance(String nume, int CUI) {
		if(instanta == null) {
			instanta = new Companie(CUI, nume);
		}
		return instanta;
	}

	private Companie(int CUI, String nume) {
		this.nume = nume;
		this.CUI = CUI;
	}

	private Companie() {
		this(23232, "CompanieAeriana");
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCUI() {
		return CUI;
	}

	public void setCUI(int cUI) {
		CUI = cUI;
	}

	@Override
	public String toString() {
		return "Companie [nume=" + nume + ", CUI=" + CUI + "]";
	}
}
