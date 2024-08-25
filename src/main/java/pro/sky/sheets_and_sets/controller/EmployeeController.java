package pro.sky.sheets_and_sets.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.sheets_and_sets.service.EmployeeService;
import pro.sky.sheets_and_sets.models.Employee;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
       return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }


    @GetMapping
    public Collection employeeBook() {
        return employeeService.getEmployees();
    }
}
