package pe.com.dyd.patrones.ejemplos.templateMethod.model;

public class HighEndComputerBuilder extends ComputerBuilder {

	@Override
	protected void addProcessor() {
		computerParts.put("Processor", "High-end Processor");
	}

	@Override
	protected void setupMotherboard() {
		motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
		motherboardSetupStatus.add("Pluging in the power supply connectors.");
		motherboardSetupStatus.forEach(step -> System.out.println(step));
	}

	@Override
	protected void addMotherboard() {
		computerParts.put("Motherboard", "High-end Motherboard");
	}
	
}
