package surprises;

import java.util.ArrayList;

import utilities.Utilities;

public class FortuneCookie implements ISurprise {

	private static ArrayList<String> fortuneCookieQuotes;

	private String message;

	public FortuneCookie(String message) {
		
		this.message = message;
		
	}

	// Populate with quotes (source:
	// http://www.fortunecookiemessage.com/archive.php?start=50)
	private static void populateFortuneCookieQuotes() {
		
		if (fortuneCookieQuotes != null) {
			return; // already populated
		} else {
			fortuneCookieQuotes = new ArrayList<>(42);
			fortuneCookieQuotes.add("Your high-minded principles spell success.");
			fortuneCookieQuotes.add("Hard work pays off in the future, laziness pays off now.");
			fortuneCookieQuotes.add("Change can hurt, but it leads a path to something better.");
			fortuneCookieQuotes.add("Enjoy the good luck a companion brings you.");
			fortuneCookieQuotes.add("People are naturally attracted to you.");
			fortuneCookieQuotes.add(
					"Hidden in a valley beside an open stream- This will be the type of place where you will find your dream.");
			fortuneCookieQuotes.add("A chance meeting opens new doors to success and friendship.");
			fortuneCookieQuotes.add("You learn from your mistakes... You will learn a lot today.");
			fortuneCookieQuotes.add("If you have something good in your life, don't let it go!");
			fortuneCookieQuotes
					.add("What ever you're goal is in life, embrace it visualize it, and for it will be yours.");
			fortuneCookieQuotes.add("Your shoes will make you happy today.");
			fortuneCookieQuotes.add("You cannot love life until you live the life you love.");
			fortuneCookieQuotes.add("Be on the lookout for coming events; They cast their shadows beforehand.");
			fortuneCookieQuotes.add("Land is always on the mind of a flying bird.");
			fortuneCookieQuotes.add("The man or woman you desire feels the same about you.");
			fortuneCookieQuotes.add("Meeting adversity well is the source of your strength.");
			fortuneCookieQuotes.add("A dream you have will come true.");
			fortuneCookieQuotes.add("Our deeds determine us, as much as we determine our deeds.");
			fortuneCookieQuotes.add("Never give up. You're not a failure if you don't give up.");
			fortuneCookieQuotes.add("You will become great if you believe in yourself.");
			fortuneCookieQuotes.add("There is no greater pleasure than seeing your loved ones prosper.");
			fortuneCookieQuotes.add("You will marry your lover.");
			fortuneCookieQuotes.add("A very attractive person has a message for you.");
			fortuneCookieQuotes.add("You already know the answer to the questions lingering inside your head.");
			fortuneCookieQuotes.add("It is now, and in this world, that we must live.");
			fortuneCookieQuotes.add("You must try, or hate yourself for not trying.");
			fortuneCookieQuotes.add("You can make your own happiness.");
			fortuneCookieQuotes.add("The greatest risk is not taking one.");
			fortuneCookieQuotes.add("The love of your life is stepping into your planet this summer.");
			fortuneCookieQuotes.add("Love can last a lifetime, if you want it to.");
			fortuneCookieQuotes.add("Adversity is the parent of virtue.");
			fortuneCookieQuotes.add("Serious trouble will bypass you.");
			fortuneCookieQuotes.add("A short stranger will soon enter your life with blessings to share.");
			fortuneCookieQuotes.add("Now is the time to try something new.");
			fortuneCookieQuotes.add("Wealth awaits you very soon.");
			fortuneCookieQuotes.add("If you feel you are right, stand firmly by your convictions.");
			fortuneCookieQuotes.add("If winter comes, can spring be far behind?");
			fortuneCookieQuotes.add("Keep your eye out for someone special.");
			fortuneCookieQuotes.add("You are very talented in many ways.");
			fortuneCookieQuotes.add("A stranger, is a friend you have not spoken to yet.");
			fortuneCookieQuotes.add("A new voyage will fill your life with untold memories.");
			fortuneCookieQuotes.add("You will travel to many exotic places in your lifetime.");
		}
		
	}

	public static void addNewQuote(String quote) {
		
		populateFortuneCookieQuotes();
		fortuneCookieQuotes.add(quote);
		
	}

	public static ISurprise generate() {
		
		populateFortuneCookieQuotes();
		return new FortuneCookie(fortuneCookieQuotes.get(
				//random int generator [0, fortuneCookieQuotes.size())
				Utilities.generateRandomNumber(fortuneCookieQuotes.size())) // 
				);
		
	}

	@Override
	public void enjoy() {
		
		System.out.println("You've just opened a magic cookie and its delicious crust awaits to be enjoyed!"
				+ "\nAlongside with its delicious taste the cookie shares with you its wisdom: " + "\n'" + this.message
				+ "'");
		
	}

	@Override
	public String toString() {
		
		return "Delicious fortune cookie";
		
	}

}
