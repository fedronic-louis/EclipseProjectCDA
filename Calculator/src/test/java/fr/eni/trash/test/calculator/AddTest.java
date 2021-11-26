package fr.eni.trash.test.calculator;

import static org.junit.Assert.*;


import org.junit.Test;

public class AddTest {

	@Test
	
	public void testAdding() {
		int a=1;
		int b=1;
		int expected=2;
		assertEquals(expected, Add.adding(a, b));
		assertEquals(20, Add.adding(10, 10));
		assertEquals(-1, Add.adding(10, -11));
		//assertEquals(expected, Add.adding(a, b));
	}

	@Test
	public void testOper() {
		assertEquals(10, new Add().oper(0,5,7,-2));
		assertEquals(-1028, new Add().oper(1000,265,-2547,254));
		assertEquals(0, new Add().oper(0,5,0,-5));
	}
}
