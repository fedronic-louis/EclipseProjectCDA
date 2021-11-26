package fr.eni.trash.test.calculator;

public class Multiplication implements Operation {

//	public int adding (int a, int b) {
//		int result = a+b;
//		System.out.println("Add");
//		return result;
//	}
	public Multiplication() { // c'est un constructeur
		super(); 
		// TODO Auto-generated constructor stub
	}

	public int multi (int ... a  ) {
		int result =1;
		for (int number : a) {
			result*=number;
		}
		//System.out.println("Multiplication");
		return result;
	}
//
//	@Override
//	public int oper(int a, int b) {
//		// TODO Auto-generated method stub
//		return adding(a, b);
//	}


	@Override
	public int oper(int... a) {
		// TODO Auto-generated method stub
		return multi(a);
	}
}
