package edu.maxim.service.util;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {
    
    public static Session getSession() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                                                    .configure()
                                                    .build();

        MetadataSources mds = new MetadataSources(registry);
        return mds.buildMetadata()
                  .buildSessionFactory()
                  .openSession();
    }
}
