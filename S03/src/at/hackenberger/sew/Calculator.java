package at.hackenberger.sew;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

	private List<Double> values;

	private double modifier;

	private Operation operation;

	public Calculator(Operation operation) {
		this.values = new ArrayList<Double>();
		this.modifier = 0;
		this.operation = operation;
	}

	public void addValue(double value) {
		this.values.add(value);
	}

	public void removeValue(double value) {
		this.values.remove(value);
	}

	public void setModifier(double modifier) {
		this.modifier = modifier;
	}

	public List<Double> processCalculations() {
		for(Double d : this.values) {
			d = operation.operation(d, this.modifier);
		}
		return this.values;
	}

	public String toString() {
		return this.values.toString();
	}

}
