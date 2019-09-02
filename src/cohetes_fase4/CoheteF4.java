package cohetes_fase4;

public class CoheteF4 {
	
	private String codigo;
	private int numeroPropulsores;
	private PropulsorF4[] listaPropulsores;
	
	double velocidadActual;
	double velocidadInicial = 0;
	double potenciaTotalPropulsores; //= 0;
	
//Constructores
	public CoheteF4(String codigo, int numeroPropulsores, int potMax1, int potMax2, int potMax3) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;
		listaPropulsores = new PropulsorF4[numeroPropulsores];
		listaPropulsores[0] = new PropulsorF4("Propulsor1", potMax1);
		listaPropulsores[1] = new PropulsorF4("Propulsor2", potMax2);
		listaPropulsores[2] = new PropulsorF4("Propulsor3", potMax3);
	}
	public CoheteF4(String codigo, int numeroPropulsores, int potMax1, int potMax2, int potMax3, int potMax4, int potMax5, int potMax6) {
		this.codigo = codigo;
		this.numeroPropulsores = numeroPropulsores;	
		listaPropulsores = new PropulsorF4[numeroPropulsores];
		listaPropulsores[0] = new PropulsorF4("Propulsor1", potMax1);
		listaPropulsores[1] = new PropulsorF4("Propulsor2", potMax2);
		listaPropulsores[2] = new PropulsorF4("Propulsor3", potMax3);
		listaPropulsores[3] = new PropulsorF4("Propulsor4", potMax4);
		listaPropulsores[4] = new PropulsorF4("Propulsor5", potMax5);
		listaPropulsores[5] = new PropulsorF4("Propulsor6", potMax6);
	}

//Metodos	
	public void setCreaDatosCohete() {
		
		for(int i=0; i<listaPropulsores.length; i++) {
			System.out.println(codigo + ": " + listaPropulsores[i].dimeDatosPropulsor());
		}
	}
	
	public void setCalculaVelocidad() {
		double potenciaTotalPropulsores = 0;
		for(int i = 0; i<listaPropulsores.length; i++) {
			potenciaTotalPropulsores+=listaPropulsores[i].getPotenciaActual();
		}
		System.out.println("La potencia del cohete en este momento es de: " + potenciaTotalPropulsores);
		
		velocidadActual = velocidadInicial + (100*Math.sqrt(potenciaTotalPropulsores));
		//System.out.println("PotTotal = " + potenciaTotalPropulsores + "; \nVelocidad Actual = " + velocidadActual);
	}
	public double getVelocidadActual() {
		return velocidadActual;
	}
	
//Acelerar
	public void setAcelerarCohete() {
		for(int i=0; i<listaPropulsores.length; i++) {
			listaPropulsores[i].setAcelerar();
		}
	}
	public void setFrenarCohete() {
		for(int i=0; i<listaPropulsores.length; i++) {
			listaPropulsores[i].setFrenar();
		}
	}
}


//cosas que no valen pero que no quería borrar
//que me devuelva solo un propulsor
	/*public PropulsorF4 getPropulsor(int i) {
		//for( i = 0;i<listaPropulsores.length; i++) {
			propulsor = listaPropulsores[i];
		//}
		
		return propulsor;
	}
	//que me de la lista de propulsores
	public PropulsorF4[] getListaPropulsores() {
		
		return listaPropulsores;
	}*/
//Estoy separando el cálculo de la potencia total propulsores getter y setter	
/*	public void setCalculaPotenciaTotal() {
		double potenciaTotalPropulsores = 0;
		for(int i = 0; i<listaPropulsores.length; i++) {
			potenciaTotalPropulsores+=listaPropulsores[i].getPotenciaActual();
		}
		System.out.println("La potencia del cohete en este momento es de: " + potenciaTotalPropulsores);
	
	}
	public double getPotenciaTotal() {
		return potenciaTotalPropulsores;
	}*/