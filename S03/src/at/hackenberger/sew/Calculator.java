package at.hackenberger.sew;

import java.util.List;

public abstract class Calculator {

	private List values;

	private double modifier;

	private Operation operation;

	public Calculator(Operation operation) {

	}

	public void addValue(double value) {

	}

	public void removeValue(double value) {

	}

	public void setModifier(double modifier) {

	}

	public List processCalculations() {
		return null;
	}

	public String toString() {
		return null;
	}

}
