package com.daljit.JPA;

import com.daljit.modal.Company;
import com.daljit.modal.Department;
import com.daljit.modal.Desk;
import com.daljit.modal.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("persistance-unit");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();


        Department department = new Department();
        department.setName("CHC");

        Department department1 = new Department();
        department1.setName("MasterCard");

        entitymanager.persist(department);
        entitymanager.persist(department1);

        Desk desk = new Desk();

        Desk desk1 = new Desk();

        Desk desk2 = new Desk();

        entitymanager.persist(desk);
        entitymanager.persist(desk1);
        entitymanager.persist(desk2);


        Employee employee1 = new Employee();
        employee1.setName("Daljit");
        employee1.setDepartment(department);
        employee1.setDesk(desk);

        Employee employee2 = new Employee();
        employee2.setName("Singh");
        employee2.setDepartment(department);
        employee2.setDesk(desk1);

        Employee employee3 = new Employee();
        employee3.setName("Prasenjeet");
        employee3.setDepartment(department1);
        employee3.setDesk(desk2);

        entitymanager.persist(employee1);
        entitymanager.persist(employee2);
        entitymanager.persist(employee3);

        Company company = new Company();
        company.setName("EPAM");

        List<Department> departmentList = new ArrayList<Department>();
        departmentList.add(department);
        departmentList.add(department1);
        company.setDepartmentList(departmentList);

        entitymanager.persist(company);

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();

    }
}
