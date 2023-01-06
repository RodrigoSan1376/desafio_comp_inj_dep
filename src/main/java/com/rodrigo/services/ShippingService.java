package com.rodrigo.services;

import com.rodrigo.entities.Order;
import org.springframework.stereotype.Service;
@Service
public class ShippingService {
    public double shipment(Order order){
        double result = 0.0;
        if(order.getBasic() < 100.00){
            result = 20.00;
        }
        else if(order.getBasic() >= 100.00 && order.getBasic() < 200.00){
            result = 12.00;
        }
        return result;
    }

}
