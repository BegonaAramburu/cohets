package cohetes_fase4;

public class Hilos implements Runnable{
	
	private String opcion;
	private CoheteF4 c;
	public int numVeces;
	
	//constructor
	public Hilos( CoheteF4 c, String opcion, int numVeces) {
		this.c = c;
		this.opcion = opcion;
		this.numVeces = numVeces;
					
	}
	
	
	@Override
	public void run() {
		switch(opcion){
		case "acelerar":
			int i = 0;
			do {
				c.setAcelerarCohete();
				i++;
			}while(i<numVeces);
			
			c.setCalculaVelocidad();
			break;
			
		case "frenar":
			int j = 0;
			do {
				c.setFrenarCohete();
				j++;
			}while(j<numVeces);
			
			c.setCalculaVelocidad();
			break;
			
		default:
			System.out.println("Error");
		}
	}
}
