package pe.com.dyd.sample.hexagonal.infra.inputport;

import java.math.BigDecimal;

import pe.com.dyd.sample.hexagonal.domain.Orders;

public interface OrdersInputPort {
    
    public Orders createOrder( String customerId, BigDecimal total );

}
