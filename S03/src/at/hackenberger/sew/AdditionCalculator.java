package at.hackenberger.sew;

/**
 * An Calculator which adds up a modifier to a list of values
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class AdditionCalculator extends Calculator {

	/**
	 * Creates a new AdditionCalculator Object
	 */
	public AdditionCalculator() {
		super(new Addition());
	}

}
