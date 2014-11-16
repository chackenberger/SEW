package at.hackenberger.sew;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class which applies an operation on a list of values
 * with a specified modifier.
 * The standard modifier is 0
 * @author Christoph Hackenberger
 * @version 1.0
 */
public abstract class Calculator {

	private List<Double> values;

	private double modifier;

	private Operation operation;

	/**
	 * Defines a new Calculator with the given operation behavior
	 * The standard modifier is 0
	 * @param operation operation behavior
	 */
	public Calculator(Operation operation) {
		this.values = new ArrayList<Double>();
		this.modifier = 0;
		this.setOperation(operation);
	}

	/**
	 * Adds a value to the list of values
	 * @param value value to add
	 */
	public void addValue(double value) {
		this.values.add(value);
	}

	/**
	 * Removes a value form the list of values
	 * @param value value to remove
	 */
	public void removeValue(double value) {
		this.values.remove(value);
	}

	/**
	 * Changes the modifier
	 * @param modifier new modifier
	 */
	public void setModifier(double modifier) {
		this.modifier = modifier;
	}

	/**
	 * Applies the operation to value of the list
	 * the results are returned as a list and are stored in the calculator
	 * as new list of values
	 * @return the list with results of the operation
	 */
	public List<Double> processCalculations() {
		List<Double> nList = new ArrayList<Double>();
		for(Double d : this.values) {
			nList.add(operation.operation(d, this.modifier));
		}
		this.values = nList;
		return this.values;
	}

	/**
	 * Returns a comma separated string of the values of the list
	 * @return comma seperated string list
	 */
	public String toString() {
		return this.values.toString();
	}
	
	/**
	 * Changes the operation behavior
	 * @param operation new operation behavior
	 */
	protected void setOperation(Operation operation) {
		this.operation = operation;
	}

}
