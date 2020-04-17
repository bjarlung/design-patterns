package Structural.Adapter;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        for (Employee e: employees) {
            System.out.println(e.getFirstName());
        }

    }
}
