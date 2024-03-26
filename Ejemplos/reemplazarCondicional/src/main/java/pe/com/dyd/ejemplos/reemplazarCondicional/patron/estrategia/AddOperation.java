package pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia;

public class AddOperation implements IMathematicalOperation {
	
	@Override
	public int doMathematicalOperation(int a, int b) {
		return a + b;
	}

	@Override
	public String getOperador() {
		return "+";
	}

}
