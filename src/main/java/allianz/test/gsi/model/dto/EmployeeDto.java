package allianz.test.gsi.model.dto;

import allianz.test.gsi.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {

    private Integer employeeId;

    private String fullName;

    private String email;

    private Date dateOfBirth;

    private Integer salary;

    private Integer managerId;

    private Date startDate;

    private Date endDate;
}
