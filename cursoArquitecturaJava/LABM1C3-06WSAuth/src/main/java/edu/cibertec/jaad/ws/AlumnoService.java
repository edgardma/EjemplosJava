package edu.cibertec.jaad.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import edu.cibertec.jaad.ws.entity.Alumno;

@WebService
@HandlerChain(file="handler-chain.xml")
interface AlumnoService {
	boolean registrar(Alumno alumno);
	Alumno consultar(String dni);
}
