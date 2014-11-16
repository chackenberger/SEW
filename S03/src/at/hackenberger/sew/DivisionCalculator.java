package at.hackenberger.sew;

/**
 * An Calculator which divides a list of values thru a a modifier
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class DivisionCalculator extends Calculator {

	/**
	 * Creates a new DivisionCalculator Object
	 */
	public DivisionCalculator() {
		super(new Division());
	}

}
