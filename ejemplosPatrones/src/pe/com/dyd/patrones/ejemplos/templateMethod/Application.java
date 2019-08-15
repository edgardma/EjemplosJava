/**
 * Ejemplo obtenido de los siguientes links:
 * Articulo: https://www.baeldung.com/java-template-method-pattern
 * git: https://github.com/eugenp/tutorials/tree/master/patterns/design-patterns/src/main/java/com/baeldung/templatemethod
 */

package pe.com.dyd.patrones.ejemplos.templateMethod;

import pe.com.dyd.patrones.ejemplos.templateMethod.model.Computer;
import pe.com.dyd.patrones.ejemplos.templateMethod.model.ComputerBuilder;
import pe.com.dyd.patrones.ejemplos.templateMethod.model.HighEndComputerBuilder;
import pe.com.dyd.patrones.ejemplos.templateMethod.model.StandardComputerBuilder;

public class Application {

	public static void main(String[] args) {
		ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
		Computer standardComputer = standardComputerBuilder.buildComputer();
		standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part: " + k + " Value: "+ v));
		
		ComputerBuilder hightEndComputerBuilder = new HighEndComputerBuilder();
		Computer highEndComputer = hightEndComputerBuilder.buildComputer();
		highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part: " + k + " Value: "+ v));
	}
}
