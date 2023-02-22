package com.example.student.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="namedepart")
    private String namedepart;
    public Departement(String namedepart) {
        super();
        this.namedepart=namedepart;

    }


}
