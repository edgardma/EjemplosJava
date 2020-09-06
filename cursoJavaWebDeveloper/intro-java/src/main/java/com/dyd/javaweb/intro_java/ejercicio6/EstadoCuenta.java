package com.dyd.javaweb.intro_java.ejercicio6;

public enum EstadoCuenta {
	ACTIVA("Act.", 1),
	BLOQUEADA("Bloq.", 2),
	ANULADA("Anul.", 3),
	INACTIVA("Inact.", 4);
	
	private String abreviatura;
	private int codigo;
	
	private EstadoCuenta(String abreviatura, int codigo) {
		this.abreviatura = abreviatura;
		this.codigo = codigo;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
