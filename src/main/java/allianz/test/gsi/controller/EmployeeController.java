package allianz.test.gsi.controller;

import allianz.test.gsi.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/getall")
    public @ResponseBody ResponseEntity<Employee> getAllEmployee(){
        return null;
    }
}
