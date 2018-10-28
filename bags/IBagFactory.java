package bags;

public interface IBagFactory {
	
	// create a new container, according to the specified type
	IBag makeBag(String type);
	
}
