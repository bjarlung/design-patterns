package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDb = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDb);

       // Employee employeeFromLdap = new EmployeeLdap("Chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("Chewie", "Solo", "Han", "han@solo.com");

        employees.add(new EmployeeAdapter(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Serlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;

    }

}
