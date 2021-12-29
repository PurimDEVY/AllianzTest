package allianz.test.gsi.mapper;

import allianz.test.gsi.model.dto.EmployeeDto;
import allianz.test.gsi.model.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapperImpl implements EmployeeMapper{

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setEmployeeId( employee.getEmployeeId() );
        employeeDto.setEmail(employee.getEmail());
        employeeDto.setDateOfBirth(employee.getDateOfBirth());
        employeeDto.setStartDate(employee.getStartDate());
        employeeDto.setEndDate(employee.getEndDate());
        employeeDto.setFullName(employee.getFullName());
        employeeDto.setManagerId(employee.getManagerId());
        employeeDto.setSalary(employee.getSalary());


        return employeeDto;
    }

    @Override
    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        return null;
    }
}
