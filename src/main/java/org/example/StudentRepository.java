package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class StudentRepository {

    private EntityManagerFactory entityManagerFactory = Configuration.createEntityManagerFactory();

    public void save (Student student) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(student);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public List<Student> findAll() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Student> studentS = entityManager.createQuery("select s from Student s ", Student.class).getResultList();

        entityManager.getTransaction().commit();

        entityManager.close();

        return studentS;
    }



}
