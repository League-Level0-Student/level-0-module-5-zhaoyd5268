package _03_method_writing._2_happy_pet;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	

	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petsort = JOptionPane.showInputDialog("what king of pet do you want?");
// 2. Add the following variable to the next line: static int happinessLevel = 0;
// this will be used to store the happiness of your pet
int happylevel = 0;
// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for(int i = 0; i<100; i++) {


			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Here are you options for your "+ petsort +" that you can do!", "What would you like to do with your pet?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed!", "Play with pet!", "Give it a drink!" , "Wash!", "Put to sleep", "Clean up poop!" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task==0) {
				feed();
				happylevel+=4;
			}
			if (task==1) {
				playwithpet();
				happylevel+=7;
			}
			if (task==2) {
				givedrink();
				happylevel+=5;	
			}
			if (task==3) {
				wash();
				happylevel+=7;	
			}
			if (task==4) {
				puttosleep();
				happylevel+=9;
			}
			if (task==5) {
				cleanuppoop();
				happylevel+=15;	
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happylevel==50) {
	JOptionPane.showMessageDialog(null, "You must love your pet!");
	break;
}
	}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private static void feed() {
JOptionPane.showMessageDialog(null, "You fed your pet some Chocalate Yummios! Happiness goes up 4 ");
	
	}
private static void playwithpet() {
	JOptionPane.showMessageDialog(null, "You play ring around the rosey with your pet! Happiness goes up 7!");

}
private static void givedrink() {
	JOptionPane.showMessageDialog(null, "You give your pet a drink! Whew! it nuzzles you! Happiness goes up 5!");
}
private static void wash() {
	JOptionPane.showMessageDialog(null, "You wash your pet! Happiness goes up 7!");
}
private static void puttosleep() {
	JOptionPane.showMessageDialog(null, "You put your pet to sleep! Sweet Dreams! Happiness goes up 9!");
}
private static void cleanuppoop() {
	JOptionPane.showMessageDialog(null, "You clean up your pet's poop! Happiness goes up 15!");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}