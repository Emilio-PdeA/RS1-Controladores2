package com.example.RS1.services;

import com.example.RS1.models.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface ControllerServiceInter {

    List<Persona> personaList = new ArrayList<>();

    //POST
    List<Persona> addPersona(Persona persona);

    //PUT
    Persona updatePersona(Integer id, Persona updatePersona);

    //DELETE
    Boolean delPersona(Integer id);

    //GET

    Persona getPersona(String nombre);
    Persona getPersona(Integer id);
    void printLista();


}
