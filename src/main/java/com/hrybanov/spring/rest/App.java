package com.hrybanov.spring.rest;

import com.hrybanov.spring.rest.configuration.MyConfig;
import com.hrybanov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        // Show all emps
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        // Show one emp
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

        // Save and update(by ID) emp
//        Employee emp = new Employee("Roman", "Harasymik", "Sales", 900);
//        emp.setId(8);
//        communication.saveEmployee(emp);

        // Delete emp by id
//        communication.deleteEmployee(8);

    }
}
