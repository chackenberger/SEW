package at.hackenberger.sew;

/**
 * Addition Behavior
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class Addition implements Operation {


	/**
	 * Add up a+b
	 * @see at.hackenberger.sew.Operation#operation(double, double)
	 */
	public double operation(double a, double b) {
		return a+b;
	}

}
