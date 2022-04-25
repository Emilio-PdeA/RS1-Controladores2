package com.example.RS1.services;

import com.example.RS1.models.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ControllerService implements ControllerServiceInter {

    public List<Persona> personaList = new ArrayList<>();


    @Override
    public List<Persona> addPersona(Persona persona) {
        personaList.add(persona);
        return personaList;
    }

    @Override
    public Persona updatePersona(Integer id) {

        if (personaList.size()>id){
            personaList.get(id);
        }

        return null;
    }

    @Override
    public Boolean delPersona(Integer id) {
        if (personaList.size()>id){
            Persona pp = personaList.get(id);
            personaList.remove(pp);
            return true;
        }
        return false;
    }

    @Override
    public Persona getPersona(String nombre) {
        for (Persona pp: personaList){
            if (nombre.equals(pp.getNombre())) return pp;
        }
        return new Persona("null","null",null);
    }
    @Override
    public Persona getPersona(Integer id){
        Integer idx = 0;
        if (personaList.size()>id) {
            return personaList.get(id);
        }
        return new Persona("null","null",null);
    }

    @Override
    public void printLista(){
        for(Persona pp : personaList){
            System.out.println(pp.toString());
        }
    }
}
