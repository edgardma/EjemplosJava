package pe.com.dyd.sample.hexagonal.infra.inputadapter;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.sample.hexagonal.domain.Orders;
import pe.com.dyd.sample.hexagonal.infra.inputport.OrdersInputPort;

@RestController
@RequestMapping(value = "order")
public class OrdersApi {
    @Autowired
    OrdersInputPort orderInputPort;

    @PostMapping(value = "create", produces=MediaType.APPLICATION_JSON_VALUE)
    public Orders create( @RequestParam String customerId, @RequestParam BigDecimal total ) {
        return orderInputPort.createOrder(customerId, total);
    }
}
