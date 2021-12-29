package allianz.test.gsi.mapper;

import allianz.test.gsi.model.dto.EmployeeDto;
import allianz.test.gsi.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper{

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);


    EmployeeDto employeeToEmployeeDto(Employee employee);

    @Mapping(source ="employeeId", target = "employeeId")
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}
