package vn.vissoft.employeevis.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employeevis")
public class Employeevis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String employeeCode;

    private String name;

    private String department;

    private String manager;

    private Double salary;

    private String work;

    private Date dateStart;

    public Employeevis() {
    }

    public Employeevis(String employeeCode, String name, String department, String manager, Double salary, String work, Date dateStart) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.department = department;
        this.manager = manager;
        this.salary = salary;
        this.work = work;
        this.dateStart = dateStart;
    }

    public Employeevis(int i, String name) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }
}
