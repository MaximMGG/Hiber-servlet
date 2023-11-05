package edu.maxim.service.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.maxim.service.Type.TypeOfProduct;
import edu.maxim.service.entity.Castomer;
import edu.maxim.service.entity.Orderer;

public class OrderUtil {
    
    public static List<Orderer> parsOrders(String orders, Date date, Castomer castomer) {
        String[] or = orders.split(" ");
        List<Orderer> ords = new ArrayList<>();
        for(String o : or) {
            Orderer r = new Orderer();
            r.setDate(date);
            r.setName(o);
            r.setCastomer(castomer);
            r.setTypeOfProduct(TypeOfProduct.ELECTRIC);
            ords.add(r);
        }
        return ords;
    }
}
