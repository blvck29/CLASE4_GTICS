package com.example.laboratorio3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping(value = "/lista_empleados")
    public String listaEmployee(   ){
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
