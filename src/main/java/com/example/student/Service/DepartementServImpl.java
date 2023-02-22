package com.example.student.Service;

import com.example.student.Entity.Departement;
import com.example.student.Repository.DepartementRepository;

import java.util.List;

public class DepartementServImpl implements Departementserv {
  private   DepartementRepository departementRepository;

    @Override
    public List<Departement> getAlldepart() {
        return departementRepository.findAll();
    }
}
