package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sunscreen for Sunday");
			break;
		case "Monday":
			System.out.println("Coffee for Monday");
			break;
		case "Tuesday":
			System.out.println("Bowling for Tuesday");
			break;
		case "Wednesday":
			System.out.println("Sandwich for Wednesday");
			break;
		case "Thursday":
			System.out.println("Boredom for Thursday");
			break;
		case "Friday":
			System.out.println("Party for Friday");
			break;
		case "Saturday":
			System.out.println("Bed for Saturday");
			break;
		default:
			System.out.println("Is this cool enought for you?");
			break;
	
		}
	}
}
