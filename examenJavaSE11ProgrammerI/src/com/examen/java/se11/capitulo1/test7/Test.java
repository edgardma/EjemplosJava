package com.examen.java.se11.capitulo1.test7;

import java.util.List;

class Father{}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Super {
	abstract List<Father> get();
}

class Sub extends Super {
	// INSERT
	
	@Override
	List<Father> get() {
		return null;
	}
}

public class Test {

}
