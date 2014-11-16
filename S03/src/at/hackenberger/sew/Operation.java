package at.hackenberger.sew;

/**
 * The definition for mathematical operation behaviors
 * @author Christoph Hackenberger
 * @version 1.0
 */
public interface Operation {

	/**
	 * Applies an operation on the parameter a and b
	 * @param a parameter
	 * @param b parameter
	 * @return result of the operation
	 */
	public double operation(double a, double b);

}
