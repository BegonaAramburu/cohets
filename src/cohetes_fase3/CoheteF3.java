package cohetes_fase3;

public class CoheteF3 {
	private String codigo;
	private int numeroPropulsores;
	private int contadorPropulsores = 0;
	PropulsorF3 propulsor;
	

	public CoheteF3(String codigo, int numeroPropulsores) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;	
	}
	
	public String getCodigo() {
		return codigo + ": ";
	}
	public PropulsorF3 crearPropulsor(int potMax) {
		
		propulsor=new PropulsorF3(potMax);
		contadorPropulsores++;
		//System.out.println("PROPULSOR"+contadorPropulsores+":");
		return propulsor;
	}

}
