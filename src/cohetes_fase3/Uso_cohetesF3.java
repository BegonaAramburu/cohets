package cohetes_fase3;

import java.util.Arrays;

import cohetes_fase1.CoheteF1;

public class Uso_cohetesF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CoheteF3 cohete1 = new CoheteF3("32WESSDS", 3);
		PropulsorF3 propulsor1 = cohete1.crearPropulsor(10);
		PropulsorF3 propulsor2 = cohete1.crearPropulsor(30);
		PropulsorF3 propulsor3 = cohete1.crearPropulsor(80);
		//propulsor1.setAcelerar();
		//propulsor1.setFrenar();
		PropulsorF3[] listaPropulsoresC1 = {propulsor1, propulsor2, propulsor3};
		
		for(int i=0; i<listaPropulsoresC1.length; i++) {
			System.out.println(cohete1.getCodigo() + "PROPULSOR" + (i+1) + ": " + listaPropulsoresC1[i].dimeDatosPropulsor());
		}
		
		CoheteF3 cohete2 = new CoheteF3("LDSFJA32", 6);
		PropulsorF3 propulsor4 = cohete2.crearPropulsor(30);
		PropulsorF3 propulsor5 = cohete2.crearPropulsor(40);
		PropulsorF3 propulsor6 = cohete2.crearPropulsor(50);
		PropulsorF3 propulsor7 = cohete2.crearPropulsor(50);
		PropulsorF3 propulsor8 = cohete2.crearPropulsor(30);
		PropulsorF3 propulsor9 = cohete2.crearPropulsor(10);

		PropulsorF3[] listaPropulsoresC2 = {propulsor4, propulsor5, propulsor6, propulsor7, propulsor8, propulsor9};
		
		for(int i=0; i<listaPropulsoresC2.length; i++) {
			System.out.println(cohete2.getCodigo() + "PROPULSOR" + (i+1) + ": " + listaPropulsoresC2[i].dimeDatosPropulsor());
		}
		
	}

}
