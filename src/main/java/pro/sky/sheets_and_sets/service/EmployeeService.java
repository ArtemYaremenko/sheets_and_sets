package pro.sky.sheets_and_sets.service;

import pro.sky.sheets_and_sets.models.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {

    Employee addEmployee(String firstName, String lastName);

    Employee removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    Collection getEmployees();
}
