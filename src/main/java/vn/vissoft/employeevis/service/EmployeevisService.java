package vn.vissoft.employeevis.service;

import org.springframework.stereotype.Service;
import vn.vissoft.employeevis.model.Employeevis;
import java.util.List;


public interface EmployeevisService {
    List<Employeevis> findAll();
    Employeevis findById(Long id);
    void save(Employeevis employeevis);

    void deleteById(Long id);
}
