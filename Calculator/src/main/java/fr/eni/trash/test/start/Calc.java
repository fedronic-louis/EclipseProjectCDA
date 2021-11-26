package fr.eni.trash.test.start;


import java.util.ArrayList;
import java.util.List;

import fr.eni.trash.test.calculator.Operation;

import fr.eni.trash.test.calculator.Add;
import fr.eni.trash.test.calculator.Multiplication;
import fr.eni.trash.test.calculator.Substraction;

public class Calc{
	
	List<Operation> listOperations=new ArrayList<Operation>();


	public List<Operation> getListOperations() {
		// TODO Auto-generated method stub
		return this.listOperations;
	}

	public Calc() {
		//super();
		this.listOperations.add(new Add());
		this.listOperations.add(new Substraction());
		this.listOperations.add(new Multiplication());
		
	}
	


}
// https://www.javatpoint.com/calculator-in-java