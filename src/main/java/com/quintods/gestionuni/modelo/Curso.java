package com.quintods.gestionuni.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Curso {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=100)
    @Required
    private String nombre;
    
    @Column(length=500)
    private String descripcion;
    
    @Column(length=50)
    @Required
    private String horario;
    
    @Column(length=20)
    @Required
    private String semestre;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    private TipoCurso tipoCurso;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre, apellido")
    private Profesor profesor;
    
    @OneToMany(mappedBy="curso")
    private Collection<Inscripcion> inscripciones;
}
