package charAt_scanners_optionDialogs;
import java.beans.FeatureDescriptor;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static String pet = "thingo";
	static int petnum;
	static int pethappy = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		while (!pet.equalsIgnoreCase("cat") && !pet.equalsIgnoreCase("bunny") && !pet.equalsIgnoreCase("eldritch abomination")) {
			pet = JOptionPane.showInputDialog(null, "<html><h2>Purchase a pet!</h2>Type 'cat' for a cute little cat!<br>Type 'bunny' for a tiny little bunny rabbit!<br>Type 'eldritch abomination' for ����</html>", "Type the pet you'd like!");
			pet = pet.toLowerCase().trim();
		}
		switch(pet) {
		case "cat":
			petnum = 0;
			break;
		case "bunny":
			petnum = 1;
			break;
		case "eldritch abomination":
			petnum = 2;
			break;
		}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (true) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Activity Time!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Cuddle", "Take for a Walk" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				feedPet();
			} else if (task == 1) {
				cuddlePet();
			} else if (task == 2) {
				walkPet();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (pethappy > 10) {
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static String petMessage(String catmessage, String bunnymessage, String eldritchmessage) {
		switch (petnum) {
		case 0:
			return catmessage;
		case 1:
			return bunnymessage;
		case 2:
			return eldritchmessage;
		}
		return "this should never appear";
	}
	static void feedPet() {
		JOptionPane.showMessageDialog(null, petMessage("You pour some food into your cat's bowl. It walks over cheerfully and eats it all up.\n<h3>+2 Happiness</h3></html>", "<html>You toss a bundle of hay to your rabbit, which it consumes.\n<h3>+2 Happiness</h3></html>", "<html>The sacrifice is brought forth. Bound by ropes, they are dragged into the hulking mouth of your <i>pet</i>. It roars miserably, and though you regret the loss of an innocent life, your pet's satisfaction makes it all worth it.\n<h3>+???? Happiness</h3></html>"));
		pethappy += 2;
	}
	static void cuddlePet() {
		JOptionPane.showMessageDialog(null, petMessage("<html>You cuddle with your cat for a while, petting its soft fur. It purrs, happily.\n<h3>+2 Happiness</h3></html>", "<html>\n<h3>+2 Happiness</h3></html>", "<html>\n<h3>+2 Happiness</h3></html>"));
	}
	static void walkPet() {
		JOptionPane.showMessageDialog(null, petMessage("<html>\n<h3>+2 Happiness</h3></html>", "<html>\n<h3>+2 Happiness</h3></html>", "<html>\n<h3>+2 Happiness</h3></html>"));
	}
}