package giver;

import bags.BagFactory;
import bags.IBag;
import surprises.ISurprise;
import utilities.Utilities;

public abstract class AbstractGiveSurprises {
	
	private IBag bag;
	// wait time (seconds) for surprises distribution
	private int waitTime;
	
	public AbstractGiveSurprises(String bagType, int waitTime) {
		
		this.bag = BagFactory.INSTANCE.makeBag(bagType);
		this.waitTime = waitTime;
		
	}
	
	public void put(ISurprise newSurprise) {
		
		this.bag.put(newSurprise);
		
	}
	
	public void give() {
		
		if (this.bag == null) {
			System.out.println("Err: " + bag + " has not been instantiated!");
			return;
		}
		
		if (this.bag.isEmpty()) {
			System.out.println("War: " + this.bag + " is empty!");
			return;
		}
		
		System.out.println("Offering a surprise! :) ");

		this.bag.takeOut();
		this.giveWithPassion();
		
	}
	
	public void giveAll() {
		
		if (this.bag == null) {
			System.out.println("Err: " + bag + " has not been instantiated!");
			return;
		}
		
		if (this.bag.isEmpty()) {
			System.out.println("War: " + this.bag + " is empty!");
			return;
		}
		
		System.out.println("Offering all surprises! ONE by ONE :)");
		
		while(!this.bag.isEmpty()) {
			this.give();
			Utilities.waitForSupriseDistribution(waitTime);
		}
		
	}
	
	public boolean isEmpty() {
		
		return this.bag.isEmpty();
		
	}
	
	// action TBD after a bag of surprises has been offered
	protected abstract void giveWithPassion();
}
