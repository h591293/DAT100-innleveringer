package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class nFakultet {

public static void main(String[] args) {
	
	int ntall = parseInt(showInputDialog("Oppgi tallet n: "));
	long fakultet = 1;
	for (int i=1;  i<=ntall; ++i) {
		fakultet *= i;
	}
		String ut = "Resultat: " + fakultet;
		showMessageDialog(null, ut);
	
	}
}