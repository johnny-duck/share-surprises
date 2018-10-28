package bags;

public class BagFactory implements IBagFactory {

	public static final BagFactory INSTANCE = new BagFactory();

	private BagFactory() {
		
	}
	
	@Override
	public IBag makeBag(String type) {
		
		type = type.toUpperCase();
		
		IBag returnedBag;
		switch (type) {
		
		case "RANDOM":
			returnedBag = new RandomBag();
			break;
		case "FIFO":
			returnedBag = new FIFOBag();
			break;
		case "LIFO":
			returnedBag = new LIFOBag();
			break;
		default:
			returnedBag = null;
			
		}
		
		if (returnedBag != null) {
			System.out.println(returnedBag + " has been created!");
		} else {
			System.out.println("Err: Factory cannot create " + type + " bag type!");
		}
		
		return returnedBag;
		
	}

}
