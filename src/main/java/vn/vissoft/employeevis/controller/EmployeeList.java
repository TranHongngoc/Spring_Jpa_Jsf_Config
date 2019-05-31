package vn.vissoft.employeevis.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.annotation.SessionScope;

import org.springframework.web.servlet.ModelAndView;
import vn.vissoft.employeevis.model.Employeevis;
import vn.vissoft.employeevis.repository.EmployeevisRepository;
import vn.vissoft.employeevis.service.EmployeevisService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@SessionScope
@ViewScoped
//@Component
@ManagedBean(name = "employeeList")
@Join(path = "/", to = ("/employees-list.jsf"))
public class EmployeeList {


   // @ManagedProperty("#{employeevisSeviceImpl}")
    //@Inject
    @Autowired
    private EmployeevisService employeevisService;

    private List<Employeevis> employeevis = new ArrayList<>();

    private Employeevis employeee;

    @PostConstruct
    public void init(){
        employeevis = employeevisService.findAll();

    }

//    public List<Employeevis> all() {
//        this.employeevis = employeevisService.findAll();
//        return employeevis;
//    }


    public EmployeevisService getEmployeevisService() {
        return employeevisService;
    }

    public void setEmployeevisService(EmployeevisService employeevisService) {
        this.employeevisService = employeevisService;
    }

    public List<Employeevis> getEmployeevis() {
        return employeevis;
    }

    public void setEmployeevis(List<Employeevis> employeevis) {
        this.employeevis = employeevis;
    }

    public Employeevis getEmployeee() {
        return employeee;
    }

    public void setEmployeee(Employeevis employeee) {
        this.employeee = employeee;
    }
}
