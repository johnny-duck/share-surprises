package utilities;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class Utilities {
	
	public static int generateRandomNumber(int bound) {
		return (new Random()).nextInt(bound);
	}
	
	public static int generateRandomNumber() {
		return (new Random()).nextInt();
	}
	public static void waitForSupriseDistribution(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
