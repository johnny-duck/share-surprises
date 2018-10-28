package surprises;

import java.util.ArrayList;
import utilities.Utilities;

public class Candies implements ISurprise {

	private static ArrayList<String> candyTypes;

	private int numberOfCandies;
	private String type;

	public Candies(int numberOfCandies, String type) {
		
		this.numberOfCandies = numberOfCandies;
		this.type = type;
		
	}

	private static void populateCandyTypes() {
		
		if (candyTypes != null) {
			return; // already populated
		} else {
			candyTypes = new ArrayList<>();
			candyTypes.add("chocolate");
			candyTypes.add("jelly");
			candyTypes.add("fruits");
			candyTypes.add("vanilla");
			candyTypes.add("fudge");
		}
		
	}

	public static ISurprise generate() {
		
		populateCandyTypes();
		int maximNumOfCandies = 101; // +1 to avoid 0 when generating the random number
		return new Candies(Utilities.generateRandomNumber(maximNumOfCandies) + 1, // +1 to avoid 0
				candyTypes.get(Utilities.generateRandomNumber(candyTypes.size())));
		
	}

	@Override
	public void enjoy() {
		
		System.out.println("Yeeey! You've got " + this + "\nMmmmm...tasty!");
		
	}

	@Override
	public String toString() {
		
		return this.numberOfCandies + " x " +  this.type 
				+ ((this.numberOfCandies == 1) ? " candy" : " candies");
		
	}

}
