package no.hvl.dat100.taskSeven;

import static javax.swing.JOptionPane.*;

public class TaskSeven {
	
	//Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, og finn og skriv ut den karakteren A-F dette tilsvarer. 
	//Grenser for de ulike karakterene skal være:
	//Utvid programmet i pkt. a) slik at det kan lese inn poengsummer fra 10 studenter og skrive ut karakteren (eller feilmelding) etter hver innlesing. HINT: hvordan kan du bruke en for-løkke til dette.
	//Legg inn kontroll på innlesinga i programmet i pkt. b) slik at ugyldige poengsummer (negativ verdi eller over 100) må leses inn på nytt.


	
	public static void main (String[]args) {
		
	 
		for (int i=0; i < 10; i++) {
			
		int score = Integer.parseInt(showInputDialog("Write your score"));
		
	boolean valid = score <=100 && score >=0;
	
		if (!valid) {
			i--;
			showMessageDialog(null, "Error, score must be between 0 and 100");
		}
		
		else if (score  <=100 && score >=90) {
			showMessageDialog(null, "You got an A");
			
		} else if (score  <=89 && score >=80) {
			showMessageDialog(null, "You got an B");
			
		} else if (score  <=79 && score >=60) {
			showMessageDialog(null, "You got an C");
			
		} else if (score  <=59 && score >=50) {
			showMessageDialog(null, "You got an D");
			
		} else if (score  <=49 && score >=40) {
			showMessageDialog(null, "You got an E");
			
		} else if (score  <=39 && score >=0) {
			showMessageDialog(null, "You got an F");
			
		}
		
		}
			
		
		
		
		
	}

}
