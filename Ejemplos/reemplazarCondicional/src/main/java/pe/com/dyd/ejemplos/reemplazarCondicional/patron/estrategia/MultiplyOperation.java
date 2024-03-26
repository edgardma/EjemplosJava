package pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia;

public class MultiplyOperation implements IMathematicalOperation {

	@Override
	public int doMathematicalOperation(int a, int b) {
		return a * b;
	}

	@Override
	public String getOperador() {
		return "*";
	}
}
