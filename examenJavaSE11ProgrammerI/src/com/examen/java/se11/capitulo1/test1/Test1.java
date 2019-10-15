package com.examen.java.se11.capitulo1.test1;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Base {
	public abstract void print() throws IOException;
}

class Derived extends Base {
	@Override
	public void print() throws IOException {
		throw new FileNotFoundException();
	}
}

public class Test1 {
	public static void main(String[] args) {
		Base b = new Derived();
		
		try {
			b.print(); // Compilation error, para que se ejecute se debe captura el error IOException
		} catch(FileNotFoundException ex) {
			System.out.print("AWE");
		} catch (IOException e) {
			System.out.print(e.toString());
		} finally {
			System.out.print("SOME");
		}
	}
}