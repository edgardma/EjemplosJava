package edu.cibertec.jaad.jaxws;

import edu.cibertec.dto.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="edu.cibertec.jaad.jaxws.TimeService")
public class BasicTimeService implements TimeService{

    @Override
    public String getTimeAsString() {
            return new Date().toString();
    }

    @Override
    public Long getTimeAsElapsed() {
            return new Date().getTime();
    }

    @Override
    public Cliente obtenerCliente(int codigo) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNombres("Edgard");
        cliente.setApellidos("Marquez");
        return cliente;
    }
    
    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente = new Cliente();
        
        cliente.setCodigo(1);
        cliente.setNombres("Edgard");
        cliente.setApellidos("Marquez");
        clientes.add(cliente);
        
        cliente = new Cliente();
        cliente.setCodigo(2);
        cliente.setNombres("Orlando");
        cliente.setApellidos("Mendoza");
        clientes.add(cliente);
        
        cliente = new Cliente();
        cliente.setCodigo(3);
        cliente.setNombres("Luis");
        cliente.setApellidos("Gonzales");
        clientes.add(cliente);
        
        return clientes;
    }
    
    @Override
    public String registrarCliente(Cliente cliente) {
        return cliente.getCodigo() + cliente.getNombres();
    }
}
