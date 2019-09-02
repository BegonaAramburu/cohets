package cohetes_fase2;

public class CoheteF2 {
	private String codigo;
	private int numeroPropulsores;
	int[] potenciaPropulsores;
	
	public CoheteF2(String codigo, int numeroPropulsores, int pot1, int pot2, int pot3) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;
		potenciaPropulsores = new int[numeroPropulsores];
		potenciaPropulsores [0] = pot1;
		potenciaPropulsores [1] = pot2;
		potenciaPropulsores [2] = pot3;	
	}
	public CoheteF2(String codigo, int numeroPropulsores, int pot1, int pot2, int pot3, int pot4, int pot5, int pot6) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;
		potenciaPropulsores = new int[numeroPropulsores];
		potenciaPropulsores [0] = pot1;
		potenciaPropulsores [1] = pot2;
		potenciaPropulsores [2] = pot3;	
		potenciaPropulsores [3] = pot4;
		potenciaPropulsores [4] = pot5;
		potenciaPropulsores [5] = pot6;	
	}
	
	public String setCodigo() {
		return codigo + ": ";
	}
	
	public void setListaPropulsores() {
		
		for(int i=0; i < potenciaPropulsores.length; i++) {
			if(i>0 ) {
				System.out.print(", ");
			}
			System.out.print(potenciaPropulsores[i]);
		}
	}
	
	
}
