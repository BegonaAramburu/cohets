package cohetes_fase2;

import java.util.Arrays;

import cohetes_fase1.CoheteF1;

public class Uso_cohetesF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoheteF2 cohete1 = new CoheteF2("32WESSDS", 3, 10, 30, 80);
		CoheteF2 cohete2 = new CoheteF2("LDSFJA32", 6, 30, 40, 50, 50, 30, 10);
		
		//cohete1.getPotenciaPropulsores();
		
		
		
		System.out.print(cohete1.setCodigo());
		cohete1.setListaPropulsores();

		System.out.print("\n" + cohete2.setCodigo());
		cohete2.setListaPropulsores();
		
	}

}
