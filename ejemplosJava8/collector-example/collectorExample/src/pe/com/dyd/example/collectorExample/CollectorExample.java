package pe.com.dyd.example.collectorExample;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import java.util.stream.Stream;

import pe.com.dyd.example.collectorExample.collector.RunnerCollector;
import pe.com.dyd.example.collectorExample.model.Runner;
import pe.com.dyd.example.collectorExample.model.Podium;

public class CollectorExample {
	public static void main(String[] args) {
		RunnerCollector usersCollector = new RunnerCollector();
		
		Set<Characteristics> characteristics = usersCollector.characteristics();
		
		Podium podium = getMockRunners().parallel()
				.collect(Collector.of(usersCollector.supplier(),
						usersCollector.accumulator(),
						usersCollector.combiner(),
						usersCollector.finisher(),
						characteristics.toArray(new Characteristics[characteristics.size()])));
		
		System.out.println(podium.toString());
	}
	
	private static Stream<Runner> getMockRunners() {
		return Stream.of(
				new Runner(1, "Orlando", "Mendoza", 300L, 2L),
				new Runner(2, "Daniel", "Malca", 307L, 1L),
				new Runner(3, "Liz", "Lopez", 307L, 1L),
				new Runner(4, "Luis", "Gonzales", 310L, 2L),
				new Runner(5, "Mario", "Sanchez", 308L, 0L),
				new Runner(6, "Edgard", "Marquez", 310L, 0L));
	}
}
