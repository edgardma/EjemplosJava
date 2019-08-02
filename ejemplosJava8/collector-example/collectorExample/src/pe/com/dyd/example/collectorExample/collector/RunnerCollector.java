package pe.com.dyd.example.collectorExample.collector;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import pe.com.dyd.example.collectorExample.model.Runner;
import pe.com.dyd.example.collectorExample.model.Podium;

public class RunnerCollector implements Collector<Runner, RunnerAccumulator, Podium> {

	@Override
	public Supplier<RunnerAccumulator> supplier() {
		return () -> new RunnerAccumulator();
	}

	@Override
	public BiConsumer<RunnerAccumulator, Runner> accumulator() {
		return RunnerAccumulator::accumulate;
	}

	@Override
	public BinaryOperator<RunnerAccumulator> combiner() {
		return RunnerAccumulator::combine;
	}

	@Override
	public Function<RunnerAccumulator, Podium> finisher() {
		return RunnerAccumulator::finish;
	}

	@Override
	public Set<Characteristics> characteristics() {
		Set<Characteristics> chars = new HashSet<Collector.Characteristics>();
		chars.add(Characteristics.CONCURRENT);
		
		return chars;
	}
}
