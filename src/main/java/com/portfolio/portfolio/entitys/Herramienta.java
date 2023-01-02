package com.portfolio.portfolio.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Objects;

@Entity
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "nombre")
    private String nombre;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Herramienta() {
    }

    public Herramienta(String nombre, Persona persona) {
        this.nombre = nombre;
        this.persona = persona;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herramienta that = (Herramienta) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(persona, that.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, persona);
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", persona=" + persona +
                '}';
    }
}
