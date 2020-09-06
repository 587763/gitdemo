package no.hvl.dat100.taskEight;

import static javax.swing.JOptionPane.*;

//Lag et program som leser inn et heltall n > 0, 
//beregner verdien n! (n fakultet) og skriver verdien til n! 

public class TaskEight {
	
	
	public static void main(String[] args) {
		
		long input =Long.parseLong(showInputDialog("Enter a number to factorialise"));
		long number=input;
		long i=number;
		
		if (input >=1) {
		while (i >=2) {
		
		i--;
		number = number*i;
		
		
		}
		showMessageDialog(null,input + "! is " + number);
		} else { 
		showMessageDialog(null,"error, your number must be >0");
			
		}
		
		
		
		
	}

}
