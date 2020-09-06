package no.hvl.dat100.TaskSix;

import static javax.swing.JOptionPane.*;

public class TaskSix {
	
	public static void main(String[] args) {
		
	int bruttoInntekt = Integer.parseInt(showInputDialog("Skriv inn din bruttoinntekt i hele kr"));
	
	final double TRINN_EIN_PROSENT = 0.019;
	final double TRINN_TO_PROSENT = 0.042;
	final double TRINN_TRE_PROSENT = 0.132;
	//final double TRINN_TRE_PROSENT_T_F= 0.112;
	//TODO spørr om du bor i troms/finnmark og gi dei lavare trinn 3 trinnskatt då.
	final double TRINN_FIRE_PROSENT =0.162;
	double trinn1 = 0;
	double trinn2 = 0;
	double trinn3 = 0;
	double trinn4 = 0;
	
		
	 if (bruttoInntekt <= 254500 && bruttoInntekt >=180801) {
		
		trinn1 = (bruttoInntekt - 180800) * TRINN_EIN_PROSENT;
		
	} else if (bruttoInntekt <= 639750 && bruttoInntekt >=254501) {
		
		trinn1 = 254500 *TRINN_EIN_PROSENT;
		trinn2 = (bruttoInntekt - 254500) * TRINN_TO_PROSENT;
		
	} else if (bruttoInntekt <= 999550 && bruttoInntekt >=639751) {
		
		trinn1 = 254500 * TRINN_EIN_PROSENT;
		trinn2 = 639750 * TRINN_TO_PROSENT;
		trinn3 = (bruttoInntekt -639750) * TRINN_TRE_PROSENT;
		
	} else if (bruttoInntekt >= 999551) {
		
		trinn1 = 254500 * TRINN_EIN_PROSENT;
		trinn2 = 639750 * TRINN_TO_PROSENT;
		trinn3 = 999550 * TRINN_TRE_PROSENT;
		trinn4 = (bruttoInntekt -999550) * TRINN_FIRE_PROSENT;
	}
	
	double trinnskatt = (trinn1 + trinn2 + trinn3 + trinn4);
	
	showMessageDialog(null,"Du betaler " +trinnskatt +"kr i trinnskatt");
	
	System.out.println(trinn1);
	System.out.println(trinn2);
	System.out.println(trinn3);
	System.out.println(trinn4);
		
	} 
	

}
