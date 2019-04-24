package com.daljit.modal;

import javax.persistence.*;

@Entity
@Table(name = "employee", catalog = "test")
public class Employee {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    @Column(name = "employee_id")
    private int id;
    @Column(name = "employee_name")
    private String name;

    @ManyToOne
    Department department;

    @OneToOne
    private Desk desk;

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}