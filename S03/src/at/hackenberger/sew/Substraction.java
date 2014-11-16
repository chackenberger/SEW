package at.hackenberger.sew;

/**
 * Substraction Behavior
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class Substraction implements Operation {


	/**
	 * Substract a-b
	 * @see at.hackenberger.sew.Operation#operation(double, double)
	 */
	public double operation(double a, double b) {
		return a-b;
	}

}
