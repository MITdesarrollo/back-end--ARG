package com.portfolio.portfolio.entitys;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.Objects;

@Entity
@Transactional
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "titulo")
    private String titulo;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "inicio")
    private Date inicio;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fin")
    private Date fin;

    @Column(name = "img")
    private String img;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Educacion() {
    }

    public Educacion(String institucion, String titulo, Date inicio, Date fin, String img, Persona persona) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
        this.persona = persona;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        Educacion educacion = (Educacion) o;
        return id == educacion.id && Objects.equals(institucion, educacion.institucion) && Objects.equals(titulo, educacion.titulo) && Objects.equals(inicio, educacion.inicio) && Objects.equals(fin, educacion.fin) && Objects.equals(img, educacion.img) && Objects.equals(persona, educacion.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, institucion, titulo, inicio, fin, img, persona);
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", institucion='" + institucion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", img='" + img + '\'' +
                ", persona=" + persona +
                '}';
    }
}
