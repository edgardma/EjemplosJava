package pe.com.dyd.ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
 * Find no of times a number gets repeated (using Java 8)
 * Source: https://www.youtube.com/watch?v=akNLS8ggS_s
 * 
 * input: 2, 3, 4, 2, 1, 2, 3, 43, 2
 * output: 1-1, 2-4, 3-2, 4-1, 43-1 
 */
public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2, 3, 4, 2, 1, 2, 3, 43, 2);
		
		Map<Integer, Long> mapValue = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		mapValue.forEach((key, value) -> {
			System.out.print(key + "-" + value + ", ");
		});
	}

}
