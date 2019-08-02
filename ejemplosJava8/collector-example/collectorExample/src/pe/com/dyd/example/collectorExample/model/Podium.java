package pe.com.dyd.example.collectorExample.model;

import java.util.Optional;

public class Podium {
	private Optional<Runner> firstRunner;
	private Optional<Runner> secondRunner;
	private Optional<Runner> thirdRunner;
	
	public Podium(Runner firstRunner, Runner secondRunner, Runner thirdRunner) {
		super();
		this.firstRunner = Optional.ofNullable(firstRunner);
		this.secondRunner = Optional.ofNullable(secondRunner);
		this.thirdRunner = Optional.ofNullable(thirdRunner);
	}

	public Optional<Runner> getFirstRunner() {
		return firstRunner;
	}

	public void setFirstRunner(Optional<Runner> firstRunner) {
		this.firstRunner = firstRunner;
	}

	public Optional<Runner> getSecondRunner() {
		return secondRunner;
	}

	public void setSecondRunner(Optional<Runner> secondRunner) {
		this.secondRunner = secondRunner;
	}

	public Optional<Runner> getThirdRunner() {
		return thirdRunner;
	}

	public void setThirdRunner(Optional<Runner> thirdRunner) {
		this.thirdRunner = thirdRunner;
	}

	@Override
	public String toString() {
		return "1 = " + firstRunner.get() + 
				"\2 = " + secondRunner.get() + 
				"\3 = " + thirdRunner.get();
	}
}
