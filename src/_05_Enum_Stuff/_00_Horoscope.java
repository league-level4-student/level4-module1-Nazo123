package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static Zodiac test = Zodiac.TAURUS;
	public static void main(String[] args) {
		horoscopeGiver(test);
	}
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscopeGiver(Zodiac z) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You will find the thing you most desire");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Somone will decive you today");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You're car will blow up");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Tomaotes will rain from the sky");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "An earthquake is coming ");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "You will transform into a cat");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "In your lifetime somone will become the president");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "For the next 10 days you will not eat a mammoth");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Chocolate will become your favorite food");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Horoscopes are fake and a scam stop listening to them");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Potatoes will make you rich");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "You will eat turkey in the next 10 days");
			break;
		}
	}
	// 3. Make a main method to test your method
	
}
