package fr.eni.trash.test.calculator;

/**
 * The Class Add.
 */


public class Add implements Operation{

//	public int adding (int a, int b) {
//		int result = a+b;
//		System.out.println("Add");
//		return result;
//	}
	
	public static int adding (int a, int b  ) {
		return a + b;
	}
//
//	@Override
//	public int oper(int a, int b) {
//		// TODO Auto-generated method stub
//		return adding(a, b);
//	}

	@Override
	public int oper(int... a) {
		int result =0;
		for (int i : a) {
			result = adding(result, i);
		}
		System.out.println("Add");
		return result;
	}
}
