package at.hackenberger.sew;

/**
 * An Calculator which substract a modifier from a list of values
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class SubstractionCalculator extends Calculator {

	/**
	 * Creates a new SubstractionCalculator Object
	 */
	public SubstractionCalculator() {
		super(new Substraction());
	}

}
