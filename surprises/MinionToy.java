package surprises;

import java.util.ArrayList;

import utilities.Utilities;

public class MinionToy implements ISurprise {

	private static ArrayList<String> minions;
	private static ArrayList<String> minionQuotes;
	private static int minionIndex = 0;

	private String minionName;

	public MinionToy(String minionName) {
		
		this.minionName = minionName;
		
	}

	private static void populateWithMinions() {
		
		if (minions != null) {
			return;
		} else {
			minions = new ArrayList<>();
			minions.add("Dave");
			minions.add("Stuart");
			minions.add("Jerry");
			minions.add("Kevin");
			minions.add("Tim");
			minions.add("Mark");
			minions.add("Phil");
			minions.add("Carl");
			minions.add("Josh");
			minions.add("Bob");
			minions.add("Evil Minion");
		}
	}

	private static void populateWithMinionQuotes() {

		if (minionQuotes != null) {
			return;
		} else {
			minionQuotes = new ArrayList<>();
			minionQuotes.add("Bananaaaah! Potato-naaaaaah!");
			minionQuotes.add("Poppadom?");
			minionQuotes.add("Gelato!");
			minionQuotes.add("Kan Pai");
			minionQuotes.add("Bah? Pappy? What kind of pappy?");
			minionQuotes.add("Bee-do! Bee-do!");
			minionQuotes.add("Ah! Pa-POY!");
			minionQuotes.add("WHAAAT?");
			minionQuotes.add("Para tu");
			minionQuotes.add("Bottom..He he!");
		}
		
	}

	public static ISurprise generate() {

		populateWithMinions();
		populateWithMinionQuotes();
		if (minionIndex >= minions.size()) {
			minionIndex = 0;
		}
		return new MinionToy(minions.get(minionIndex++));
		
	}

	@Override
	public void enjoy() {

		System.out.print("Minion toy unrapped! Congratulations!!! ");
		if (this.minionName.equals("Evil Minion")) {
			System.out.println("You have an " + this.minionName + "!" + "\n" + this.minionName + " says: "
					+ "AAAaarr!!! BleahBlahBleeeh !!! (more uninteligible sounds)");
		} else {
			System.out.println("You have a " + this.minionName + "!" + "\n" + this.minionName + " says: "
					+ minionQuotes.get(Utilities.generateRandomNumber(minionQuotes.size())));
		}
		
	}

	@Override
	public String toString() {
		
		return "Minion Toy: " + this.minionName;
		
	}

}
