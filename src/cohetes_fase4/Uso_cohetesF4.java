package cohetes_fase4;

import java.util.Arrays;

import cohetes_fase1.CoheteF1;

public class Uso_cohetesF4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//Creo los cohetes con sus códigos y su número de propulsores con sus potmax		
		CoheteF4 cohete1 = new CoheteF4("32WESSDS", 3, 10, 30, 80);
		CoheteF4 cohete2 = new CoheteF4("LDSFJA32", 6, 30, 40, 50, 50, 30, 10);
		
//2. Mostrar codigo y potencias propulsores
		System.out.println(" 2.CODIGO Y POTENCIAS PROPULSORES");
		cohete1.setCreaDatosCohete();
		cohete2.setCreaDatosCohete();
		
//3. Velocidad actual cohetes:
		System.out.println("3.VELOCIDAD ACTUAL COHETES");
		cohete1.setCalculaVelocidad();
		cohete2.setCalculaVelocidad();
		System.out.println("Velocidad Actual cohete1 = " + cohete1.getVelocidadActual());
		System.out.println("Velocidad Actual cohete2 = " + cohete2.getVelocidadActual());
		
//4. Acelerar con los cohetes 3 veces
		
		System.out.println("4. ACELERAR LOS COHETES 3 VECES");
		System.out.println("COHETE1:");
		Thread hilo1 = new Thread(new Hilos(cohete1, "acelerar", 3));
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("COHETE2:");
		Thread hilo2 = new Thread(new Hilos(cohete2, "acelerar", 3));
		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//5. Mostrar por pantalla velocidad actual 
		System.out.println("5. MOSTRAR VELOCIDAD ACTUAL COHETES:");
		System.out.println("Velocidad Actual cohete1 = " + cohete1.getVelocidadActual());
		System.out.println("Velocidad Actual cohete2 = " + cohete2.getVelocidadActual());
		
//6. Frenar 5 veces con cohete1 y acelerar 7 veces con cohete2
		System.out.println("6. FRENAR 5 VECES COHETE1; ACELERAR 7 VECES COHETE2");
		System.out.println("COHETE1:");
		Thread hilo3 = new Thread(new Hilos(cohete1, "frenar", 5));
		hilo3.start();
		try {
			hilo3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("COHETE2:");
		Thread hilo4 = new Thread(new Hilos(cohete2, "acelerar", 7));
		hilo4.start();
		try {
			hilo4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//7. Mostrar por pantalla la Velocidad actual 
		System.out.println("7. MOSTRAR VELOCIDAD ACTUAL COHETES:");
		System.out.println("Velocidad Actual cohete1 = " + cohete1.getVelocidadActual());
		System.out.println("Velocidad Actual cohete2 = " + cohete2.getVelocidadActual());
//8. Acelerar 15 veces los 2 cohetes
		System.out.println("8. ACELERAR 15 VECES LOS 2 COHETES");
		System.out.println("COHETE1:");
		Thread hilo5 = new Thread(new Hilos(cohete1, "acelerar", 15));
		hilo5.start();
		try {
			hilo5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("COHETE2:");
		Thread hilo6 = new Thread(new Hilos(cohete2, "acelerar", 15));
		hilo6.start();
		try {
			hilo6.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//9. Mostrar por pantalla la Velocidad actual 
		System.out.println("9. MOSTRAR VELOCIDAD ACTUAL COHETES:");
		System.out.println("Velocidad Actual cohete1 = " + cohete1.getVelocidadActual());
		System.out.println("Velocidad Actual cohete2 = " + cohete2.getVelocidadActual());

	}

}
