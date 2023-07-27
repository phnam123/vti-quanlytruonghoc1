package com.vti.quanlytrghoc.repositories;

import com.vti.quanlytrghoc.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository
extends JpaRepository<Department, Integer> {
    //cung cap cac phuong thuc de lam viev voi table
    //insert
    //update
    //delete

}
