package com.daljit.JPA;

import com.daljit.modal.Department;
import com.daljit.modal.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("persistance-unit");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Department department = new Department();
        department.setName("CHC");

        entitymanager.persist(department);

        Employee employee1 = new Employee();
        employee1.setName("Daljit");
        employee1.setDepartment(department);

        Employee employee2 = new Employee();
        employee2.setName("Singh");
        employee2.setDepartment(department);

        entitymanager.persist(employee1);
        entitymanager.persist(employee2);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();

    }
}
