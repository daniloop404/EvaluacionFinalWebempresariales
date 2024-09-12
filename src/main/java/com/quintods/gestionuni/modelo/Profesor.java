package com.quintods.gestionuni.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Profesor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    @Required
    private String nombre;
    
    @Column(length=100)
    @Required
    private String apellido;
    
    @Column(length=100)
    @Required
    private String email;
    
    @Column(length=20)
    private String telefono;
    
    @OneToMany(mappedBy="profesor")
    private Collection<Curso> cursos;
}