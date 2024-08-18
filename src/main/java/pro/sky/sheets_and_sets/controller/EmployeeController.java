package pro.sky.sheets_and_sets.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.sheets_and_sets.service.EmployeeService;
import pro.sky.sheets_and_sets.Employee;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @ResponseStatus
    @GetMapping("/add")
    public String add(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
        employeeService.addEmployee(firstName, lastName);
        return "Добавлен новый сотрудник - " + new Employee(firstName, lastName);
    }

    @ResponseStatus
    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
        employeeService.removeEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @ResponseStatus
    @GetMapping("/find")
    public Employee find(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
        employeeService.findEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @ResponseStatus
    @GetMapping("/employeebook")
    public List employeeBook() {
        return employeeService.getEmployees();
    }
}
