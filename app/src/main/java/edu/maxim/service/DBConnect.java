package edu.maxim.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import edu.maxim.service.entity.Castomer;
import edu.maxim.service.util.SessionUtil;

public class DBConnect {


    public Castomer getCastomer(String name) {
        Castomer castomer;

        try(Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();

            Query<Castomer> query = session.createQuery("from Castomer c where " + 
                                               "c.name=:name", Castomer.class);         
            query.setParameter("name", name);
            castomer = query.uniqueResult();
            tx.commit();
        }
        return castomer;
    }


    public boolean saveCastomer(Castomer castomer) {

        try(Session session = SessionUtil.getSession()) {
            Transaction tx = session.beginTransaction();

            session.persist(castomer);

            Integer check = Integer.valueOf(castomer.getId());

            if (check == null) {
                return false;
            }

            tx.commit();
        }
        return true;    
    }
}
