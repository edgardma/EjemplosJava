package pe.com.dyd.patrones.ejemplos.templateMethod.model;

public class StandardComputerBuilder extends ComputerBuilder {

	@Override
	protected void addProcessor() {
		computerParts.put("Processor", "Standard Processor");
	}

	@Override
	protected void setupMotherboard() {
		motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(step -> System.out.println(step));
	}

	@Override
	protected void addMotherboard() {
		computerParts.put("Motherboard", "Standard Motherboard");
	}

}
