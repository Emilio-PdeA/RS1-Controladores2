package com.example.RS1.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Persona {
    String nombre;
    String poblacion;
    Integer edad;

    public Persona(String nombre,String poblacion, Integer edad){
        this.nombre= nombre;
        this.poblacion= poblacion;
        this.edad= edad;
    }

    public void setPersona(Persona persona){
        if(persona.nombre!=null) this.nombre = persona.nombre;
        if(persona.poblacion!=null) this.poblacion = persona.poblacion;
        if(persona.edad!=null) this.edad = persona.edad;
    }
}
