package vn.vissoft.employeevis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.vissoft.employeevis.model.Employeevis;

import java.util.List;

public interface EmployeevisRepository extends JpaRepository<Employeevis,Long> {

}
