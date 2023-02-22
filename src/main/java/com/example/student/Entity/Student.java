package com.example.student.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="firstname", nullable = false)
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="email")
    private String email;

    public Student(String firstname, String lastname, String email) {
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }

}
