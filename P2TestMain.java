import java.util.ArrayList;

import bags.BagFactory;
import bags.FIFOBag;
import bags.IBag;
import bags.LIFOBag;
import bags.RandomBag;
import gatherer.GatherSurprises;
import giver.GiveSurpriseAndApplause;
import giver.GiveSurpriseAndHug;
import giver.GiveSurpriseAndSing;
import surprises.Candies;
import surprises.FortuneCookie;
import surprises.ISurprise;
import surprises.MinionToy;

public class P2TestMain {
	
	public static void main(String[] args) {
		/* SURPRISEs TESTS */
		System.out.println("SURPRISEs TEST - START");
			ISurprise fortuneCookie = FortuneCookie.generate();
			ISurprise candies = Candies.generate();
			ISurprise minion = MinionToy.generate(); //Dave
			
			fortuneCookie.enjoy();
			System.out.println();
			
			fortuneCookie = FortuneCookie.generate(); //different quote
			fortuneCookie.enjoy();
			System.out.println();
			
			candies.enjoy();
			System.out.println();
			
			candies = Candies.generate(); //different num and/or type
			candies.enjoy();
			System.out.println();
			
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Stuart
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Jerry
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Kevin
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Tim
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Mark
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Phil
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Carl
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Josh
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Bob
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Evil Minion
			minion.enjoy();
			System.out.println();
			
			minion = MinionToy.generate(); //Dave
			minion.enjoy();
			System.out.println();
			
		System.out.println("SURPRISEs TEST - END");
		System.out.println(" - - - - - - - - - - - - - ");
		System.out.println(" - - - - - - - - - - - - - ");
		/* BAGs TESTS*/
		System.out.println("BAGs TEST - START");
			IBag randomBag = new RandomBag();
			IBag fifoBag = new FIFOBag();
			IBag lifoBag = new LIFOBag();
			
			//should appear Warr messages
			randomBag.takeOut(); 
			fifoBag.takeOut();
			lifoBag.takeOut();
			System.out.println();
			//populating randomBag adding surprises one by one
			randomBag.put(minion);       // position 0
			randomBag.put(candies);      // position 1
			randomBag.put(fortuneCookie);// position 2
			System.out.println("Size = " + randomBag.size() + " (to compare with the fifoBag.put(bag))");
			System.out.println();
			
			// populating the other bags by adding the randomBag
			fifoBag.put(randomBag); // OK
			System.out.println();
			fifoBag.put(randomBag); // NOK - warr: randomBAg is empty
			System.out.println();
			fifoBag.takeOut(); //should be - Minion Dave
			fifoBag.takeOut(); //should be - candies
			fifoBag.takeOut(); //should be - fortuneCookie
			lifoBag.put(fifoBag); // NOK - fifoBag has been emptied
			System.out.println();
			
			// populate lifoBag
			lifoBag.put(minion);       // position 0
			lifoBag.put(candies);      // position 1
			lifoBag.put(fortuneCookie);// position 2
			System.out.println();
			lifoBag.takeOut(); //should be - fortuneCookie
			lifoBag.takeOut(); //should be - candies
			lifoBag.takeOut(); //should be - minion
			lifoBag.takeOut(); // NOK - empty bag
			System.out.println();
		System.out.println("BAGs TEST - END");
		System.out.println(" - - - - - - - - - - - - - ");
		System.out.println(" - - - - - - - - - - - - - ");
		System.out.println("GATHERER TEST - START");
		/* GATHERER TESTS*/
			ISurprise randomSurprise = GatherSurprises.gather();
			randomSurprise = GatherSurprises.gather();
			System.out.println();
			
			ArrayList<ISurprise> surprises = GatherSurprises.gather(6);
			System.out.println();
		System.out.println("GATHERER TEST - END");
		System.out.println(" - - - - - - - - - - - - - ");
		System.out.println(" - - - - - - - - - - - - - ");
		System.out.println("GIVER TEST - END");
		/* GIVE TESTS*/
		//givers
		GiveSurpriseAndApplause gsa = new GiveSurpriseAndApplause("fifo", 2);
		GiveSurpriseAndHug gsh = new GiveSurpriseAndHug("liFO", 3);
		GiveSurpriseAndSing gss = new GiveSurpriseAndSing("RANDOM", 1);
		System.out.println();
		//test empty bag
		gsa.give(); //NOK - empty
		System.out.println();
		//populate bags
		for (ISurprise surprise: surprises) {
			gsa.put(surprise);
			gsh.put(surprise);
			gss.put(surprise);
		}
		
		//give surprises
		gsa.giveAll();
		System.out.println(" - - ");
		gsh.give();
		System.out.println(" - - ");
		gss.giveAll();
	}
	
}
