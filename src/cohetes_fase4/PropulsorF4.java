package cohetes_fase4;

public class PropulsorF4 {
	private int potMax;
	private int potActual;
	private int potencia = 10;
	private String nombrePropulsor;
	
//Constructor	
	public PropulsorF4(String nombrePropulsor, int potMax) {
		this.nombrePropulsor = nombrePropulsor;
		this.potMax = potMax;
		potActual = 0;
	}
	
	public void setAcelerar() {
		
		if(potActual<potMax) {
			potActual = potActual + potencia;
			System.out.println("Potencia propulsor " + potActual);
		}else if(potActual >= potMax){
			potActual = potMax;
			System.out.println("¡Potencia máxima alcanzada!" + potActual);
		}
	}
	
	public void setFrenar() {
		if(potActual > 0) {
			potActual = potActual - potencia;
			System.out.println("Potencia propulsor " + potActual);
		}else if(potActual <= 0){
			potActual = 0;
			System.out.println("¡Estás en potencia 0!");
		}		
	}
	
	public int getPotenciaActual() {
		return potActual;
	}
	
	public String dimeDatosPropulsor() {
		return nombrePropulsor + ": Potencia Máxima = " + potMax +"; Potencia Actual = " + potActual; 
	}

}
