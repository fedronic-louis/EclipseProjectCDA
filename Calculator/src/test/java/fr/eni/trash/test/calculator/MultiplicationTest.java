package fr.eni.trash.test.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
public class MultiplicationTest {

	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("Debut all Test");
	}

	

	@Before
	public void setUp(){
		System.out.print("Start : " );
	}
	

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("End. See you");
	}

	@After
	public void tearDown(){
		System.out.println("Finish ");
	}
	@Test
	public void testMultiplication() {
		System.out.println("Test Constructeur Mulitplication");
		Multiplication multi = new Multiplication();
		//System.out.println(multi.getClass());
		assertTrue(multi.getClass().equals(Multiplication.class));
	}

	@Test
	public void testMulti() {
		System.out.println("Test méthode multi de Mulitplication");
		assertEquals(5,new Multiplication().multi(5,1));
		assertEquals(15,new Multiplication().multi(5,1,3));
		assertEquals(-15,new Multiplication().multi(5,1,-3));
	}

	@Test
	//@DisplayName ("Test méthode oper de Mulitplication")
	public void testOper() {
		System.out.println("Test méthode oper de Mulitplication");
		assertEquals(15,new Multiplication().oper(5,1,3));
		assertEquals(-15,new Multiplication().oper(5,1,-3));
	}

}
