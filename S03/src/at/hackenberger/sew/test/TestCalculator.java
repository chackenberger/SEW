package at.hackenberger.sew.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import at.hackenberger.sew.AdditionCalculator;
import at.hackenberger.sew.DivisionCalculator;
import at.hackenberger.sew.MultiplicationCalculator;
import at.hackenberger.sew.SubstractionCalculator;

public class TestCalculator {

	private AdditionCalculator ad;
	private SubstractionCalculator sub;
	private MultiplicationCalculator mul;
	private DivisionCalculator div;
	
	@Before
	public void setup() {
		this.ad = new AdditionCalculator();
		this.sub = new SubstractionCalculator();
		this.mul = new MultiplicationCalculator();
		this.div = new DivisionCalculator();
	}
	
	@Test
	public void testAdditionCalc() {
		ad.addValue(15);
		ad.addValue(7);
		ad.setModifier(3);
		List<Double> l = new ArrayList<Double>();
		l.add(18D);
		l.add(10D);
		assertEquals(l, ad.processCalculations());
		assertEquals(l.toString(), ad.toString());
	}
	
	@Test
	public void testSubstractionCalc() {
		sub.addValue(15);
		sub.addValue(7);
		sub.setModifier(3);
		List<Double> l = new ArrayList<Double>();
		l.add(12D);
		l.add(4D);
		assertEquals(l, sub.processCalculations());
		assertEquals(l.toString(), sub.toString());
	}
	
	@Test
	public void testMultiplicationCalc() {
		mul.addValue(15);
		mul.addValue(7);
		mul.setModifier(3);
		List<Double> l = new ArrayList<Double>();
		l.add(45D);
		l.add(21D);
		assertEquals(l, mul.processCalculations());
		assertEquals(l.toString(), mul.toString());
	}
	
	@Test
	public void testDivisionCalc() {
		div.addValue(15);
		div.addValue(7);
		div.setModifier(3);
		List<Double> l = new ArrayList<Double>();
		l.add(5D);
		l.add(7/3D);
		assertEquals(l, div.processCalculations());
		assertEquals(l.toString(), div.toString());
	}

}
