package org.example;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class Configuration {
    public static EntityManagerFactory createEntityManagerFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER,"org.postgresql.Driver");
        properties.put(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
        properties.setProperty(Environment.USER, "postgres");
        properties.setProperty(Environment.PASS, "post");

        properties.put(Environment.HBM2DDL_AUTO,"update");
        properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL,"true");

        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

        configuration.addProperties(properties);

        configuration.addAnnotatedClass(Student.class);
        return configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
    }

}
