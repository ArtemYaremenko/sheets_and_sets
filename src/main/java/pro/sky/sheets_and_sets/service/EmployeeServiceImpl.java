package pro.sky.sheets_and_sets.service;

import org.springframework.stereotype.Service;
import pro.sky.sheets_and_sets.models.Employee;
import pro.sky.sheets_and_sets.exceptions.EmployeeAlreadyAddedException;
import pro.sky.sheets_and_sets.exceptions.EmployeeNotFoundException;
import pro.sky.sheets_and_sets.exceptions.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final int maxEmployees = 20;

    public List<Employee> employeeBook = new ArrayList<>();

    @Override
    public Collection<Employee> getEmployees(){
        return Collections.unmodifiableList(employeeBook);
    }

    @Override
    public Employee addEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        if (employeeBook.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException();
        } else if (employeeBook.contains(newEmployee)) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employeeBook.add(newEmployee);
            return newEmployee;
        }
    }

    @Override
    public Employee removeEmployee(String firstName, String lastName) {
        Employee removedEmployee = new Employee(firstName, lastName);
        if (employeeBook.contains(removedEmployee)) {
            employeeBook.remove(removedEmployee);
            return removedEmployee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        Employee foundEmployee = new Employee(firstName,lastName);
        if (!employeeBook.contains(foundEmployee)) {
            throw new EmployeeNotFoundException();
        } else {
            return foundEmployee;
        }
    }
}
