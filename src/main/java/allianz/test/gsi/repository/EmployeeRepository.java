package allianz.test.gsi.repository;

import allianz.test.gsi.model.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findAll();
}
