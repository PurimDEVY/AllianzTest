package allianz.test.gsi.service;

import allianz.test.gsi.mapper.EmployeeMapper;
import allianz.test.gsi.model.dto.EmployeeDto;
import allianz.test.gsi.model.entity.Employee;
import allianz.test.gsi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(EmployeeDto employeeDto){
        Employee employee = EmployeeMapper.INSTANCE.employeeDtoToEmployee(employeeDto);
        employeeRepository.save(employee);
    }



}
