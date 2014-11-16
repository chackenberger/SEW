package at.hackenberger.sew;

/**
 * An Calculator which multiplies a modifier to a list of values
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class MultiplicationCalculator extends Calculator {

	/**
	 * Creates a new MultiplicationCalculator Object
	 */
	public MultiplicationCalculator() {
		super(new Multiplication());
	}

}
