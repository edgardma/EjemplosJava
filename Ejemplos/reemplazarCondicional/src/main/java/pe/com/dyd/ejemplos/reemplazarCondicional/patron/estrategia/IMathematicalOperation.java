package pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia;

public interface IMathematicalOperation {
	
	String getOperador();
	
	int doMathematicalOperation(int a, int b);

}
