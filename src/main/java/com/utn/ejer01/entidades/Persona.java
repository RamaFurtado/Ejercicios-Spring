package com.utn.ejer01.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor

public class Persona implements Serializable {
@Id
@GeneratedValue()
    private long id;
    private String nombre;
    private String apellido;
    private int edad;


    public Persona() {

    }
}
