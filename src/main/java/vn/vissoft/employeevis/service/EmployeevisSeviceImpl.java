package vn.vissoft.employeevis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vissoft.employeevis.model.Employeevis;
import vn.vissoft.employeevis.repository.EmployeevisRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeevisSeviceImpl implements EmployeevisService {

    @Autowired
    private EmployeevisRepository employeevisRepository;


    @Override
    public List<Employeevis> findAll() {
        return employeevisRepository.findAll();
    }

    @Override
    public Employeevis findById(Long id) {
        return employeevisRepository.findById(id).get();
    }

    @Override
    public void save(Employeevis employeevis) {
        employeevisRepository.save(employeevis);

    }

    @Override
    public void deleteById(Long id) {
        employeevisRepository.deleteById(id);
    }
}
