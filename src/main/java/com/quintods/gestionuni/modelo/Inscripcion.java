package com.quintods.gestionuni.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
public class Inscripcion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre, apellido")
    private Estudiante estudiante;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    private Curso curso;
    
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    private LocalDate fechaInscripcion;
}