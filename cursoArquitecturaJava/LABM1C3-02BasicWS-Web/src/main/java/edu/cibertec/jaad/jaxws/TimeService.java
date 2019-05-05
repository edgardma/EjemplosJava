package edu.cibertec.jaad.jaxws;

import edu.cibertec.dto.Cliente;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface TimeService {
	@WebMethod(operationName="timeStr")
	@WebResult(name="timeResponse", partName="partTimeResponse")
	String getTimeAsString();
	
	@WebMethod
	Long getTimeAsElapsed();
        
        @WebMethod
        Cliente obtenerCliente(int codigo);
        
        @WebMethod
        List<Cliente> listarCliente();
        
        @WebMethod
        String registrarCliente(Cliente cliente);
}
