import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Hello seeker of truth - I am Esmerelda, and I see all that you desire to know about your future.");
		System.out.println(
				"I will ask you a series of questions to discern your fortune. Only honest answers will provide your true fortune.");
		System.out.println(
				"If at any time you wish to quit this program, simply type \"quit\" - knowing your future is not for the faint of heart!");
		System.out.println("Are you ready to begin? (type \"yes\" or \"no\")");
		String beginAnswer = input.next();
		if (beginAnswer.toLowerCase().equals("no")) {
			System.out.println("Come back when you are ready to seek the truth!");
		} else {

			System.out.println("Please enter your first name:"); // ask the user
																	// for
																	// their
																	// first
																	// name
			String firstName = input.next();

			System.out.println("Please enter your last name:"); // ask the user
																// for
																// their last
																// name
			String lastName = input.next();

			System.out.println("Please enter your age:"); // ask the user for
															// their
															// age
			int userAge = input.nextInt();

			// ask the user for their birth month (as an int)
			System.out.println(
					"Please enter your birth month (enter as a number, i.e if you were born in May, you should enter \"5\"):");
			int birthMonth = input.nextInt();

			// ask the user for their favorite ROYGBIV color (if user does not
			// know
			// ROYGBIV, give Help option)
			System.out.println(
					"Please enter your favorite ROYGBIV color (enter \"help\" if you do not understand ROYGBIV:)");
			String favColor = input.next();
			int numSiblings = 0;
			switch (favColor) {
			case "help":
				System.out.println("R = Red, O = Orange, Y = Yellow, G = Green, B = Blue, I = Indigo, V = Violet");
				System.out.println("Please enter your favorite color:");
				favColor = input.next();
				System.out.println("Please enter how many siblings you have:");
				numSiblings = input.nextInt();
				break;
			default: // ask the user for their number of siblings
				System.out.println("Please enter how many siblings you have:");
				numSiblings = input.nextInt();
			}

			// If the user’s age is an odd number, then the user will retire in
			// ____
			// years if the user's age is odd, or ___ years if user's age is
			// even.
			int retireYears;
			if (userAge % 2 == 0) {
				retireYears = 15;
			} else {
				retireYears = 10;
			}

			// If the user’s birth month is 1-4, they will have $____ in the
			// bank;
			// if the user's birth month is 5-8, they will have $____ in the
			// bank;
			// and if it is 9-12, then they will have $____ in the bank.
			// If the user enters something other than 1-12 as their birth
			// month,
			// they will have $0.00 in the bank.
			String bankMoney;
			switch (birthMonth) {
			case 1:
			case 2:
			case 3:
			case 4:
				bankMoney = "$2,000,000";
				break;
			case 5:
			case 6:
			case 7:
			case 8:
				bankMoney = "$3,000,000";
				break;
			case 9:
			case 10:
			case 11:
			case 12:
				bankMoney = "$1,500,000";
				break;
			default:
				bankMoney = "$0.00";
			}

			// If the user’s number of siblings is zero, then they will have a
			// vacation home in ____ (location),
			// if one then they will have a vacation home in ____ (location),
			// if two then they will have a vacation home in ____ (location),
			// if three then they will have a vacation home in ____ (location),
			// or if more than three then they will have a vacation home in ____
			// (location).
			// If the user enters anything other than a number greater than or
			// equal
			// to 0, they should get a bad vacation home!

			String vacationHome;
			if (numSiblings == 0) {
				vacationHome = "in Budapest";
			} else if (numSiblings == 1) {
				vacationHome = "in Amsterdam";
			} else if (numSiblings == 2) {
				vacationHome = "Madrid";
			} else if (numSiblings == 3) {
				vacationHome = "in London";
			} else if (numSiblings >= 4) {
				vacationHome = "in Munich";
			} else {
				vacationHome = "at the bottom of the Grove City, OH landfill.";
			}

			// Depending on which ROYGBIV color is the user’s favorite, they
			// will
			// have a specific mode of transportation (i.e. car, boat, plane,
			// etc.).
			String transportation;
			if (favColor.toLowerCase().equals("red")) {
				transportation = "Corvette";
			} else if (favColor.toLowerCase().equals("orange")) {
				transportation = "Harley motorcycle";
			} else if (favColor.toLowerCase().equals("yellow")) {
				transportation = "50 ft yacht";
			} else if (favColor.toLowerCase().equals("green")) {
				transportation = "Lamborghini";
			} else if (favColor.toLowerCase().equals("blue")) {
				transportation = "Corvette";
			} else if (favColor.toLowerCase().equals("indigo")) {
				transportation = "100 ft yacht";
			} else if (favColor.toLowerCase().equals("violet")) {
				transportation = "helicopter";
			} else {
				transportation = "bicycle";
			}

			// The user’s fortune should be thus:
			// [First Name] [Last Name] will retire in [# of Years] with [Amount
			// of
			// Money] in the bank, a vacation home in [Location] and a [Mode of
			// Transportation].
			System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with "
					+ bankMoney + " in the bank, a vacation home " + vacationHome + ", and a " + transportation + ".");
			input.close();
		}
	}

}
