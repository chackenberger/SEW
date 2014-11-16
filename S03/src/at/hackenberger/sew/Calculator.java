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
		this.setOperation(operation);
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
		List<Double> nList = new ArrayList<Double>();
		for(Double d : this.values) {
			nList.add(operation.operation(d, this.modifier));
		}
		this.values = nList;
		return this.values;
	}

	public String toString() {
		return this.values.toString();
	}
	
	protected void setOperation(Operation operation) {
		this.operation = operation;
	}

}
