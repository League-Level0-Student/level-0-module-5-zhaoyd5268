package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
boolean count = false; 
	String num = JOptionPane.showInputDialog("Give me a number please?");
int numasint = Integer.parseInt(num);

for(int i =2; i<numasint; i++) {

	if (numasint % i == 0 ) {
count = true;
break;
	} 		

	}
if (count==true ) {
	JOptionPane.showMessageDialog(null, "THIS NUMBER IS NOT PRIME!");
}
if (count==false) {
	JOptionPane.showMessageDialog(null, "THIS NUMBER IS PRIME!");
}

	
}
}		
