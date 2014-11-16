package at.hackenberger.sew;

/**
 * Multiplication Behavior
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class Multiplication implements Operation {


	/**
	 * Multiply a*b
	 * @see at.hackenberger.sew.Operation#operation(double, double)
	 */
	public double operation(double a, double b) {
		return a*b;
	}

}
