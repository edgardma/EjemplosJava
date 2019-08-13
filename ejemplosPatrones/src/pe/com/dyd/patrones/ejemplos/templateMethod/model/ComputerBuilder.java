package pe.com.dyd.patrones.ejemplos.templateMethod.model;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ComputerBuilder {
	
	protected Map<String, String> computerParts = new HashMap<>();
	protected List<String> motherboardSetupStatus = new ArrayList<>();
	
	public final Computer buildComputer() {
		addMotherboard();
		setupMotherboard();
		addProcessor();
		
		return getComputer();
	}

	private Computer getComputer() {
		return new Computer(computerParts);
	}

	protected abstract void addProcessor();

	protected abstract void setupMotherboard();

	protected abstract void addMotherboard();
	
	public List<String> getMotherboardSetupStatus() {
		return motherboardSetupStatus;
	}
	
	public Map<String, String> getComputerParts() {
		return computerParts;
	}
}
