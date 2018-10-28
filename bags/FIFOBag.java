package bags;

import surprises.ISurprise;
import utilities.Utilities;

import java.util.ArrayList;

public class FIFOBag implements IBag{

	private ArrayList<ISurprise> surprises;
	
	public FIFOBag() {
		
		this.surprises = new ArrayList<>();
		
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		
		if (newSurprise == null) {
			System.out.println("Err: Cannot add a null surprise!");
			return;
		}
		
		boolean addedToBAg = this.surprises.add(newSurprise);
		if (addedToBAg) {
			System.out.println(newSurprise + " added to " + this + "!");
		} else {
			System.out.println("Err: Cannot add " + newSurprise + "! Contact Santa's helps!");
		}
		
	}

	@Override
	public void put(IBag bagOfSurprises) {
		//exit if bagOfSurprises is null or is the same bag
		if (bagOfSurprises == null || bagOfSurprises == this) {
			System.out.println("Err: Bag parameter cannot be null or the same bag!");
			return;
		}
		
		if (bagOfSurprises.isEmpty()) {
			System.out.println("Warr: The " + bagOfSurprises + " is empty!");
			return;
		}
		
		int surpriseCounter = bagOfSurprises.size();
		while (!bagOfSurprises.isEmpty()) {
			this.put(bagOfSurprises.takeOut());
		}
		System.out.println(surpriseCounter + (surpriseCounter > 1 ? " suprises" : "surprise") + " added succesfully!");
	}

	@Override
	public ISurprise takeOut() {
		
		if (this.surprises.isEmpty()) {
			System.out.println("Warr: " + this + " is empty!");
			return null;
		}
		ISurprise surprise = surprises.remove(0); // always removes the first element
		if (surprise == null) {
			System.out.println("It's a broken surprise! Contact Santa's Helps!");
		} else {
			System.out.println(surprise + " taken out successfully of the " + this + "!");
		}
		
		return surprise;
		
	}

	@Override
	public boolean isEmpty() {
		
		return this.surprises.isEmpty();
		
	}

	@Override
	public int size() {
		
		return this.surprises.size();
		
	}

	@Override
	public String toString() {
		
		return "FIFOBag";
		
	}
}
