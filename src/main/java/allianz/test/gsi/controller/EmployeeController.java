package allianz.test.gsi.controller;

import allianz.test.gsi.model.dto.EmployeeDto;
import allianz.test.gsi.model.entity.Employee;
import allianz.test.gsi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    @ResponseBody
    public List<Employee> getAll(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/employee")
    @ResponseBody
    public Employee create(@RequestBody EmployeeDto employeeDto){

        employeeService.saveEmployee(employeeDto);
        return  null;
    }
}
