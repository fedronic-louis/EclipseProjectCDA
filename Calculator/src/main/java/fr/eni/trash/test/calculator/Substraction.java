package fr.eni.trash.test.calculator;

public class Substraction implements Operation{
//	public int substract (int a, int b) {
//		int result = a-b;
//		System.out.println("Substraction");
//		return result;
//	}
//
//	@Override
//	public int oper(int a, int b) {
//		// TODO Auto-generated method stub
//		return substract(a, b);
//	}
	public int substract (int ... a  ) {
		int result =a[0];
		for (int i = 1; i < a.length; i++) {

			result=result-a[i];
		}
		System.out.println("Substraction: "+result);
		return result;
	}
	@Override
	public int oper(int... a) {
		// TODO Auto-generated method stub
		return substract(a);
	}
	
}
