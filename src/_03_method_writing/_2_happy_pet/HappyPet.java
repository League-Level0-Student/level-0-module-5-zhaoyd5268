package _03_method_writing._2_happy_pet;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petsort = JOptionPane.showInputDialog("what king of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Here are you options for your "+ petsort +" that you can do!", "What would you like to do with your pet?", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed!", "Play with pet!", "Give it a drink!" , "Wash!", "Put to sleep", "Clean up poop!" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private void feed() {
JOptionPane.showMessageDialog(null, "You fed your pet some Chocalate Yummios! Happiness goes up 4 ");
	}
private void playwithpet() {
	JOptionPane.showMessageDialog(null, "You play ring around the rosey with your pet! Happiness goes up 7!");
}
private void givedrink() {
	JOptionPane.showMessageDialog(null, "You give your pet a drink! Whew! it nuzzles you! Happiness goes up 5!");
}
private void wash() {
	JOptionPane.showMessageDialog(null, "You wash your pet! Happiness goes up 7!");
}
private void puttosleep() {
	JOptionPane.showMessageDialog(null, "You put your pet to sleep! Sweet Dreams! Happiness goes up 9!");
}
private void cleanuppoop() {
	JOptionPane.showMessageDialog(null, "You clean up your pet's poop! Happiness goes up 15!");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}