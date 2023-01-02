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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "puesto")
    private String puesto;

    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "img")
    private String img;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "url")
    private String url;

    @Column(name = "activo")
    private boolean activo;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "inicio")
    private Date inicio;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fin")
    private Date fin;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

    public Experiencia() {
    }

    public Experiencia(String puesto, String descripcion, String img, String empresa, String url, boolean activo, Date inicio, Date fin, Persona persona) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.img = img;
        this.empresa = empresa;
        this.url = url;
        this.activo = activo;
        this.inicio = inicio;
        this.fin = fin;
        this.persona = persona;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
        Experiencia that = (Experiencia) o;
        return id == that.id && activo == that.activo && Objects.equals(puesto, that.puesto) && Objects.equals(descripcion, that.descripcion) && Objects.equals(img, that.img) && Objects.equals(empresa, that.empresa) && Objects.equals(url, that.url) && Objects.equals(inicio, that.inicio) && Objects.equals(fin, that.fin) && Objects.equals(persona, that.persona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, puesto, descripcion, img, empresa, url, activo, inicio, fin, persona);
    }

    @Override
    public String toString() {
        return "Experiencia{" +
                "id=" + id +
                ", puesto='" + puesto + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", img='" + img + '\'' +
                ", empresa='" + empresa + '\'' +
                ", url='" + url + '\'' +
                ", activo=" + activo +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", persona=" + persona +
                '}';
    }
}
