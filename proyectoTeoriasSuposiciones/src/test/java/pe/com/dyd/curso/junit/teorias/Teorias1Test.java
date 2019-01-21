package pe.com.dyd.curso.junit.teorias;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Teorias1Test {

	@DataPoint
	public static String a = "a";
	
	
	@DataPoint
	public static String b = "b";
	
	@Theory
	public void testTeorias(String primero, String segundo) {
		System.out.println("Combinacion: " + primero + " con " + segundo);
	}
}

/*
 *  aa
 *  ab
 *  ba
 *  bb
 */