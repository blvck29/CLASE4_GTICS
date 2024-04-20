package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Department;
import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.DepartmetRepository;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobRepository;
import com.example.laboratorio3.repository.LocationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    final EmployeesRepository employeesRepository;
    final JobRepository jobRepository;
    final LocationRepository locationRepository;
    final DepartmetRepository departmetRepository;

    public EmployeeController(EmployeesRepository employeesRepository,
                               JobRepository jobRepository,
                                LocationRepository locationRepository,
                              DepartmetRepository departmetRepository) {
        this.employeesRepository = employeesRepository;
        this.jobRepository = jobRepository;
        this.locationRepository = locationRepository;
        this.departmetRepository = departmetRepository;
    }

    @GetMapping(value = "/Laboratorio3/lista_empleados")
    public String listaEmployee(Model model){
        List<Employees> employeesList = employeesRepository.findAll();
        model.addAttribute("employeesList",employeesList);
        return "/employee/lista";
    }

    @GetMapping(value = "/Laboratorio3/nuevo_empleado")
    public String nuevoEmployeeForm(Model model) {
        model.addAttribute("jobsList",jobRepository.findAll());
        model.addAttribute("managersList",employeesRepository.findAll());
        model.addAttribute("departmentsList",departmetRepository.findAll());
        return "/employee/newFrm";
    }

    @GetMapping(value = "/Laboratorio3/save_empleado")
    public String guardarEmployee() {
        return "/employee/lista";
    }


    @GetMapping(value = "/Laboratorio3/edit_employee")
    public String editarEmployee() {
        return "/employee/editFrm";
    }


    @GetMapping(value = "/Laboratorio3/delete_employee")
    public String borrarEmpleado() {
        return "/employee/lista";
    }


}
