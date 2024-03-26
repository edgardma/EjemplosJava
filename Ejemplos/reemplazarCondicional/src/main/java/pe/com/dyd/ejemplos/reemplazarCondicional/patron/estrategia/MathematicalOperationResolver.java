package pe.com.dyd.ejemplos.reemplazarCondicional.patron.estrategia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MathematicalOperationResolver {
	
	private List<IMathematicalOperation> mathematicalOperation = new ArrayList<IMathematicalOperation>();
	
	public MathematicalOperationResolver() {
		mathematicalOperation.add(new AddOperation());
		mathematicalOperation.add(new MultiplyOperation());
		mathematicalOperation.add(new DivideOperation());
	}
	
	public IMathematicalOperation resolve(String operador) {
		Optional<IMathematicalOperation> resultado = mathematicalOperation.stream()
				.filter(x -> operador.equals(x.getOperador()))
				.findFirst();
		
		if (resultado.isPresent()) {
			return resultado.get();
		}
		
		return null;
	}
}
