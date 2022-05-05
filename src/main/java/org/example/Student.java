package org.example;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private char gender;
    private String country;

    public Student(String name, String lastName, String email, char gender, String country) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.country = country;
    }
}
