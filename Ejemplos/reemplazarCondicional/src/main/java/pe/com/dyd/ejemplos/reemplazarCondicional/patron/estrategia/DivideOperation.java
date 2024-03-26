package pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia;

public class DivideOperation implements IMathematicalOperation {

	@Override
	public int doMathematicalOperation(int a, int b) {
		
		if (b == 0)
            throw new ArithmeticException();
		
		return a / b;
	}
	
	@Override
	public String getOperador() {
		return "/";
	}

}
