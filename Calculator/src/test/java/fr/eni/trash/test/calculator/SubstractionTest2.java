package fr.eni.trash.test.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubstractionTest2 {

	@Test
	public void testOper() {
		int a=5;
		int b=1;
		assertEquals(4, new Substraction().oper(a, b));
		assertEquals(9, new Substraction().oper(20, 7,4));
		assertEquals(115, new Substraction().oper(200, 7,40, 3, 10, 25));
		assertEquals(-10, new Substraction().oper(20, 25,5));
	}

}
