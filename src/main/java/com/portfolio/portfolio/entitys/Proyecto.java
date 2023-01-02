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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "inicio")
    private Date inicio;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fin")
    private Date fin;

    @Column(name = "img")
    private String img;

    @Column(name = "url")
    private String url;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, Date inicio, Date fin, String img, String url, Persona persona) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.img = img;
        this.url = url;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        Proyecto proyecto = (Proyecto) o;
        return id == proyecto.id && Objects.equals(nombre, proyecto.nombre) && Objects.equals(descripcion, proyecto.descripcion) && Objects.equals(inicio, proyecto.inicio) && Objects.equals(fin, proyecto.fin) && Objects.equals(img, proyecto.img) && Objects.equals(url, proyecto.url) && Objects.equals(persona, proyecto.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, inicio, fin, img, url, persona);
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", img='" + img + '\'' +
                ", url='" + url + '\'' +
                ", persona=" + persona +
                '}';
    }
}
