package demo.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	MyCalc calc = new MyCalc();

	@Test
	public void testSum()
	{
		assertEquals(25,calc.sum(20, 5));
		assertEquals(15,calc.sum(10, 5));
		assertEquals(45,calc.sum(20, 25));
	}
	
	@Test
	public void testDiff()
	{
		assertEquals(15,calc.diff(20, 5));
	}

}
