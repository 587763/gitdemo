package no.hvl.dat100;

public class MyntLab {
	
	public static void main (String [] args) {
		
		//leser inn eit beløp og lagrer det som int
		String amount = javax.swing.JOptionPane.showInputDialog("Enter your amount");
		int amountInt = Integer.parseInt(amount);
		
		//leser inn ein pris og lagrer det som int
		String cost = javax.swing.JOptionPane.showInputDialog("Enter the cost");
		int costInt = Integer.parseInt(cost);
		
		//kalkulerer kor mykje ein skal ha igjen
		//deler mengden på 10 for å finne 10kr, finner resten ved hjelp av %
		int remainder = amountInt - costInt;
		int ten = remainder / 10;
		int one = remainder % 10;
		
		
		
		//skriver resultatet ut på skjermen
		javax.swing.JOptionPane.showMessageDialog (null, ("you get ") + ten +(" ,10kr coins back and ") + one +(" ,1 kr coins back"));
		
		
		//System.out.println(amountInt);
		//System.out.println(costInt);
		
		
		
	
		
	}

}
