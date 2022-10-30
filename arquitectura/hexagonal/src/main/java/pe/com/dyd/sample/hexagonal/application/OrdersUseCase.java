package pe.com.dyd.sample.hexagonal.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.com.dyd.sample.hexagonal.domain.Orders;
import pe.com.dyd.sample.hexagonal.infra.inputport.OrdersInputPort;
import pe.com.dyd.sample.hexagonal.infra.outputport.EntityRepository;

@Component
public class OrdersUseCase implements OrdersInputPort {
    
    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
            .id( UUID.randomUUID().toString() )
            .customerId( customerId )
            .total( total )
            .build();

        return entityRepository.save( order );
    }
}
