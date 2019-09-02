package cohetes_fase1;

public class CoheteF1 {
	private String codigo;
	private int numeroPropulsores;
	
	public CoheteF1(String codigo, int numeroPropulsores) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;
	}
	public String toString() {
		return codigo + ": " + numeroPropulsores + " propulsores.";
	}

}
