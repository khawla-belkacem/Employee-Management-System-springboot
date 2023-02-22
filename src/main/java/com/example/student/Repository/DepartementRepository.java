package com.example.student.Repository;

import com.example.student.Entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository <Departement,Long> {
}
