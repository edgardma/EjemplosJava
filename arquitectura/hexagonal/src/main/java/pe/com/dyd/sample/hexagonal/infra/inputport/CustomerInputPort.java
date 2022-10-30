package pe.com.dyd.sample.hexagonal.infra.inputport;

import java.util.List;

import pe.com.dyd.sample.hexagonal.domain.Customer;

public interface CustomerInputPort {
    
    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();

}
