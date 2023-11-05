package edu.maxim.service.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.maxim.service.entity.Order;

public class OrderUtil {
    
    public static List<Order> parsOrders(String orders, Date date) {
        String[] or = orders.split(" ");
        List<Order> ords = new ArrayList<>();
        for(String o : or) {
            Order r = new Order();
            r.setDate(date);
            r.setName(o);
            ords.add(r);
        }
        return ords;
    }
}
