package pe.com.dyd.ejemplos.reemplazarCondicional;

import pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia.IMathematicalOperation;
import pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia.MathematicalOperationResolver;

// Fuente:
// https://www.nocountryforgeeks.com/no-mas-condicionales-anidados-abraza-el-patron-estrategia/
public class Main {

	public static void main(String[] args) throws Exception {
		// Usar un método:
		System.out.println(DoMathematicalOperation("+", 2, 2));
		System.out.println(DoMathematicalOperation2("+", 2, 2));
	}
	
	public static int DoMathematicalOperation2(String operador, int a, int b) {
		var resolver = new MathematicalOperationResolver();
	    var mathematicalOperation = resolver.resolve(operador);
	    return ((IMathematicalOperation) mathematicalOperation).doMathematicalOperation(a, b);
	}
	
	public static int DoMathematicalOperation(String operador, int a, int b) throws Exception {
		if (operador == "+") {
			return Add(a, b);
		}
		
		if (operador == "*" ) {
			return Multiply(a, b);
		}
		
		if (operador == "/") {
			return Divide(a, b);
		}
		
		throw new Exception("You must pass a valid operator!");
	}

	private static int Divide(int a, int b) {
		return a / b;
	}

	private static int Multiply(int a, int b) {
		return a * b;
	}

	private static int Add(int a, int b) {
		return a + b;
	}

}
