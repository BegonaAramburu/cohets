package cohetes_fase3;

public class PropulsorF3 {
	private int potMax;
	private int potActual;
	private static final int masPotencia = 10;
	private static final int menosPotencia = -10;
	
	public PropulsorF3(int potMax) {
		this.potMax = potMax;
		potActual = 0;
	}
	public void setAcelerar() {
		if(potActual<potMax) {
			potActual = potActual + masPotencia;
		}else {
			System.out.println("¡Potencia máxima alcanzada!");
		}
	}
	public int getPotenciaActual() {
		return potActual;
	}
	public void setFrenar() {
		if(potActual > 0) {
			potActual = potActual + menosPotencia;
		}else {
			System.out.println("¡Estás en potencia 0!");
		}
		
	}
	public String dimeDatosPropulsor() {
		return "Potencia Máxima = " + potMax +"; Potencia Actual = " + potActual; 
	}

}
