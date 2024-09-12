package com.quintods.gestionuni.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class TipoCurso {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @Column(length=50)
    @Required
    private String nombre;
    
    @Column(length=200)
    private String descripcion;
}