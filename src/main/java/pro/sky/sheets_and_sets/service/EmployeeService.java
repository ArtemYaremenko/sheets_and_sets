package pro.sky.sheets_and_sets.service;

import pro.sky.sheets_and_sets.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);

    void findEmployee(String firstName, String lastName);

    List getEmployees();
}
