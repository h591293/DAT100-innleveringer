package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class lab2oppg7 {
	public static void main(String[] args) {
		for (int elev=1; elev<=10; elev++) {
		int poeng = parseInt(showInputDialog("Gi poeng: "));
		String ut = "";
		
			if (poeng>=90 && poeng<=100)
				ut = "Karakte: A";
			if (poeng>=80 && poeng<=89)
				ut = "Karakter: B";
			if (poeng>=60 && poeng<=79)
				ut = "Karakter: C";
			if (poeng>=50 && poeng<=59)
				ut = "Karakter: D";
			if (poeng>=40 && poeng<=49)
				ut = "Karakter: E";
			if (poeng>=0 && poeng<=39)
				ut = "Karakter: F";
			if (poeng<0)
				ut = "Ugyldig poengsum.";
			if (poeng>=101)
				ut = "Ugyldig poengsum.";
			
		showMessageDialog(null, ut);
		}
	}
}