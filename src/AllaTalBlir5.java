/*
 * 
   
  string sm = JOptionPane.showInputDialog ("Skriv ett tal.");
  string sn = JOptionPane.showInputDialog ("Skriv in ett tal till.");
  int m = Integer.parseInt (sm);
  int n = Integer.parseInt (sn);
  int r = 0;
  
  for (int i=1; r > 0; i++)
   r = % m/n;
   n = m;
   r = n; 
  }
  else 
    if r = 0
     JOptionPane.showMessageDialog (null, "Nu är beräkningarna slut.");
 }
 */

/*
 * 1. ruta där man skriver in ett tal.
 * 2. display på hela beräkningen.
 * 3. "Skriv in en till siffra". 
 * 4. display hela beräkningen.
 * 5. "COOOOOOOOLT!!! Svaret blir alltid 5!!!!!"
 */

import javax.swing.*;

public class AllaTalBlir5 {

	public static void main(String[] args) {
		
		String ursprungsTal = JOptionPane.showInputDialog ("Skriv ett tal.");
		
		int tal = Integer.parseInt(ursprungsTal);
		int mult2 = tal * 2; 
		int plus10 = mult2 + 10; 
		int div2 = plus10/2; 
		int resultat = div2 -tal; 
		String visaUträkning = "\n" + tal + " * 2 = " + mult2 + 
				"\n" + mult2 + " + 10 = "+ plus10 + "\n"+ plus10+" / 2 = "+ div2+"\n" + div2 + " - " + tal
				+ " = " + resultat;
		
		JOptionPane.showMessageDialog(null, "Nu ska jag räkna ut en cool grej. \nVänta så ska du få se...");
		
		
		JOptionPane.showMessageDialog(null, "Ditt tal, gånger 2, + 10, sen dividerat med 2, och minus ditt tal\n = \n" + resultat);
		JOptionPane.showMessageDialog(null, "Såhär har jag räknat:" + visaUträkning);
		
	/*	String ursprungsTal2 = JOptionPane.showInputDialog ("Vi provar igen. \nSkriv ett tal till.");
		int tal2 = Integer.parseInt(ursprungsTal2);
		
		JOptionPane.showMessageDialog(null, "Nu ska jag räkna igen. \nVänta så ska du få se...");
		
		
		JOptionPane.showMessageDialog(null, "Ditt tal, gånger 2, + 10, sen dividerat med 2, och minus ditt tal\n = \n" + resultat);
		JOptionPane.showMessageDialog(null, "Såhär har jag räknat:" + visaUträkning);
	*/	
	}

}
