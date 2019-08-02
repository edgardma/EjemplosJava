package pe.com.dyd.example.collectorExample.collector;

import pe.com.dyd.example.collectorExample.model.Podium;
import pe.com.dyd.example.collectorExample.model.Runner;

public class RunnerAccumulator {
	private Runner firstRunner;
	private Runner secondRunner;
	private Runner thirdRunner;
	
	public void accumulate(Runner runner) {
		runner.addPenalty();
		decidePositions(runner);
	}
	
	public RunnerAccumulator combine(RunnerAccumulator other) {
		Podium podium = other.finish();
		
		podium.getFirstRunner().ifPresent(this::decidePositions);
		podium.getSecondRunner().ifPresent(this::decidePositions);
		podium.getThirdRunner().ifPresent(this::decidePositions);
		
		return this;
	}
	
	public Podium finish() {
		return new Podium(firstRunner, secondRunner, thirdRunner);
	}
	
	private void decidePositions(Runner runner) {
		if (isFasterThan(runner, firstRunner)) {
			setFirstRunner(runner);
		} else if(isFasterThan(runner, secondRunner)) {
			setSecondRunner(runner);
		} else if (isFasterThan(runner, thirdRunner)) {
			thirdRunner = runner;
		}
	}
	
	private void setFirstRunner(Runner runner) {
		thirdRunner = secondRunner;
		secondRunner = firstRunner;
		firstRunner = runner;
	}
	
	private void setSecondRunner(Runner runner) {
		thirdRunner = secondRunner;
		secondRunner = runner;
	}
	
	private static boolean isFasterThan(Runner runner, Runner accumulatorRunner) {
		return (accumulatorRunner == null || runner.compareTo(accumulatorRunner) < 0);
	}
}
