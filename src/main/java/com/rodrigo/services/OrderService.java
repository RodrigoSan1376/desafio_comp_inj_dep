package com.rodrigo.services;

import com.rodrigo.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public double total(Order order){
        return (order.getBasic() - order.getDiscount() * order.getBasic() / 100.00) + shippingService.shipment(order);
    }
}
