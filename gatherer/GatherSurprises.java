package gatherer;

import java.util.ArrayList;

import surprises.Candies;
import surprises.FortuneCookie;
import surprises.ISurprise;
import surprises.MinionToy;
import utilities.Utilities;

public final class GatherSurprises {
	
	private GatherSurprises() {
		
	}

	public static ISurprise gather() {
		
		int surpriseTypesNo = 3; // to be modified based on the types of instantiable surprises
		
		ISurprise donatedSurprise;
		
		// to be modified in case surpriseTypesNo changes
		switch (Utilities.generateRandomNumber(surpriseTypesNo)) {
		
		case 0:
			donatedSurprise = Candies.generate();
			break;
		case 1:
			donatedSurprise = FortuneCookie.generate();
			break;
		case 2:
			donatedSurprise = MinionToy.generate();
			break;
		default:
			donatedSurprise = null;
			
		}
		
		if (donatedSurprise != null) {
			System.out.println(donatedSurprise + " donated!");
		} else {
			System.out.println("Err : Gathering error! Contact Santa's Helps!");
		}
		
		return donatedSurprise;
	}
	
	public static ArrayList<ISurprise> gather(int supriseNumber) {
		
		ArrayList<ISurprise> donatedSurprises = new ArrayList<>(supriseNumber);
		
		for (int i = 1; i <= supriseNumber; i++) {
			donatedSurprises.add(gather());
		}
		return donatedSurprises;
	}
}
