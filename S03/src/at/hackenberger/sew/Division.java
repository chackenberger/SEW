package at.hackenberger.sew;

/**
 * Division Behavior
 * @author Christoph Hackenberger
 * @version 1.0
 */
public class Division implements Operation {


	/**
	 * Divide a/b
	 * @see at.hackenberger.sew.Operation#operation(double, double)
	 */
	public double operation(double a, double b) {
		return a/b;
	}

}
