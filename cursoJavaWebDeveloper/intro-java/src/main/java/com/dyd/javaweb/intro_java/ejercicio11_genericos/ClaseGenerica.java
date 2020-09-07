package com.dyd.javaweb.intro_java.ejercicio11_genericos;

public class ClaseGenerica<T> {
	private T variableInstancia;
	private T[] arregloGenerico;
	
	public ClaseGenerica(T variableInstancia) {
		super();
		this.variableInstancia = variableInstancia;
	}

	public <R> T metodoGenerico(R objetoR) {
		return variableInstancia;
	}
	
	public T getVariableInstancia() {
		return variableInstancia;
	}
	public void setVariableInstancia(T variableInstancia) {
		this.variableInstancia = variableInstancia;
	}
	public T[] getArregloGenerico() {
		return arregloGenerico;
	}
	public void setArregloGenerico(T[] arregloGenerico) {
		this.arregloGenerico = arregloGenerico;
	}
}
