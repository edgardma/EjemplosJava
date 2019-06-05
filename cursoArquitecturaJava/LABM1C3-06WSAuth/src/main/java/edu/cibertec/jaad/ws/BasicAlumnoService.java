package edu.cibertec.jaad.ws;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import edu.cibertec.jaad.ws.entity.Alumno;

@WebService(endpointInterface="edu.cibertec.jaad.ws.AlumnoService")
public class BasicAlumnoService implements AlumnoService{
    private static Map<String , Alumno> alumnos =
            new HashMap<String, Alumno>();
    
    @Override
    public boolean registrar(Alumno alumno) {
        boolean response = false;
        if(!alumnos.containsKey(alumno.getDni())){
            alumnos.put(alumno.getDni(), alumno);
            response = true;
        }
        return response;
    }

    @Override
    public Alumno consultar(String dni) {
        return alumnos.get(dni);
    }

}
