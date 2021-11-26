package fr.eni.trash.test.start;

import fr.eni.trash.test.calculator.Operation;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Calc start = new Calc();

		for (Operation op : start.getListOperations()) {
		//	System.out.println(op.oper(5, 2));
			
			System.out.println(op.oper(5,1));
		}

	}
}
