package com.portfolio.portfolio.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Objects;

@Entity
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url")
    private String url;

    @Column(name = "icono")
    private String icono;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Contacto() {
    }

    public Contacto(String nombre, String url, String icono, Persona persona) {
        this.nombre = nombre;
        this.url = url;
        this.icono = icono;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
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
        Contacto contacto = (Contacto) o;
        return id == contacto.id && Objects.equals(nombre, contacto.nombre) && Objects.equals(url, contacto.url) && Objects.equals(icono, contacto.icono) && Objects.equals(persona, contacto.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, url, icono, persona);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", icono='" + icono + '\'' +
                ", persona=" + persona +
                '}';
    }
}
