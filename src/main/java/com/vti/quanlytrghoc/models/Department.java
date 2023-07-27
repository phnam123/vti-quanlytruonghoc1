package com.vti.quanlytrghoc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "Department")
@Entity
public class Department {
    @Id
    //@ID hiểu đây là khóa chính của Table
    private  int id;
    private  String name ;
    private  String desc;


}

