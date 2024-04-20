package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    final EmployeesRepository employeesRepository;
    final JobRepository jobRepository;
    final DepartmetRepository departmetRepository;

    public EmployeeController(EmployeesRepository employeesRepository, JobRepository jobRepository, DepartmetRepository departmetRepository) {
        this.employeesRepository = employeesRepository;
        this.jobRepository = jobRepository;
        this.departmetRepository = departmetRepository;
    }

    @GetMapping(value = "/lista_empleados")
    public String listaEmployee( Model model ){

       // List<Employees> listaEmpleados = employeesRepository.findAll();

       // model.addAttribute("listaEmpleados", listaEmpleados);
        return "/employee/lista";
    }

    @GetMapping(value = "/nuevo_empleado")
    public String nuevoEmployeeForm( Model model) {
        model.addAtribute("listaJobs",jobRepository.findAll());
        model.addAtribute("listaJobs",jobRepository.findAll());
        return "/employee/newFrm";
    }

    @GetMapping(value = "/save_empleado")
    public String guardarEmployee(Model model) {
        return "/employee/lista";
    }


    @GetMapping(value = "/edit_employee")
    public String editarEmployee(Model model) {
        return "/employee/editFrm";
    }


    @GetMapping(value = "/delete_employee")
    public String borrarEmpleado(Model model) {
        return "/employee/lista";
    }


}
