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

    public EmployeeController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @GetMapping(value = "/lista_empleados")
    public String listaEmployee( Model model ){

        List<Employees> listaEmpleados = employeesRepository.findAll();

        model.addAttribute("listaEmpleados", listaEmpleados);
        return "/employee/lista";
    }

    @GetMapping(value = "/nuevo_empleado")
    public String nuevoEmployeeForm( ) {
        return "/employee/newFrm";
    }

    @GetMapping(value = "/save_empleado")
    public String guardarEmployee() {
        return "/employee/lista";
    }


    @GetMapping(value = "/edit_employee")
    public String editarEmployee() {
        return "/employee/editFrm";
    }


    @GetMapping(value = "/delete_employee")
    public String borrarEmpleado() {
        return "/employee/lista";
    }


}
