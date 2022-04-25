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
}
