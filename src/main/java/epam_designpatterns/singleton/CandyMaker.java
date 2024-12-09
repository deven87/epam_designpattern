package epam_designpatterns.singleton;

/*
Implement the principles of Singleton pattern Make the below
class to
be initialised
only once.
Then make
it Thread safe
 */

public class CandyMaker {

	/**
	 * create private reference of the class, volatile for threadsafe
	 */
	private static volatile CandyMaker candyMaker;
	private boolean empty;
	private boolean boiled;

	//This code is only started when the boiler is empty
	/*
	 * change constructor to private, and if called again when already initialized,
	 * throw exception
	 */
	private CandyMaker() throws Exception {
		if (candyMaker != null) {
			throw new Exception("Reflection Attack, Constructor access not allowed");
		}
		empty = true;
		boiled = false;
	}

	/*
	 * create public static method to create object from outside, add condition to
	 * instantiate only once
	 */
	public static CandyMaker getCandyMaker() throws Exception {
		if (candyMaker == null) {
			// instead of making the method as synch, add sync block for performance
			synchronized(CandyMaker.class) {
				if (candyMaker == null) {
					candyMaker = new CandyMaker();
				}
			}
		}
		System.out.println(candyMaker.hashCode());
		return candyMaker;
	}

	// to fill the boiler it must be empty, and once its full,
	// we set the empty and boiled flags
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the candyMaker with milk and choclate mix
		}
	}

	// To drain the boiler, it must be full(non-empty) and also boiled.
	// once it is drained, we set the empty back to true
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}

	// to boil the mixture the boiler has to be full and not already boiled.
	// once its boiled we set the boiled flag to true
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the content to boil
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}