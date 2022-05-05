package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        StudentRepository studentRepository = new StudentRepository();
        Student student = new Student("Nurzhan","Abdyraeva","nabdyraeva25@gmail.com",'f',"Kyr");
        studentRepository.save(student);

        studentRepository.findAll().forEach(x-> {
            System.out.println(x.getEmail()+ x.getName());
        });


    }
}
