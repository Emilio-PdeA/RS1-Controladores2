package com.example.RS1.controllers;

import com.example.RS1.models.Persona;
import com.example.RS1.services.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("persona")
public class Controller {

    @Autowired
    ControllerService controllerService = new ControllerService();

    @GetMapping()
    List<Persona> getListaPersona(){
        return controllerService.personaList;
    }

    //GET METHOD
    @GetMapping(path="/nombre/{nombre}")
    Persona getPersonaNombre(@PathVariable String nombre){
       return controllerService.getPersona(nombre);
    }

    @GetMapping(path = "/{id}")
    Persona getPersonaId(@PathVariable Integer id){
        return controllerService.getPersona(id);
    }

    //POST METHOD
    @PostMapping()
    List<Persona> postPersona(@RequestBody Persona persona){
        controllerService.personaList.add(persona);
        return controllerService.personaList;
    }

    //DELETE METHOD
    @DeleteMapping(path = "/{id}")
    String delPersona(@PathVariable Integer id){
        if(controllerService.delPersona(id)){
            return "Persona eliminada!";
        };
        return "ID no existe";
    }





}
