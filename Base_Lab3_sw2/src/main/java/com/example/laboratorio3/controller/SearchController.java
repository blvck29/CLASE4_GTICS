package com.example.laboratorio3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {


    @GetMapping(value = "/reporte_visual")
    public String indice(){
        return "Search/indice";
    }


//COMPLETAR


}
