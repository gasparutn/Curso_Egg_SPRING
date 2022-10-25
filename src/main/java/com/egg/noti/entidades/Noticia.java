package com.egg.noti.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

@Entity
public class Noticia implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String titulo;
    private String cuerpo;
    private boolean eliminado;
    private String foto;

    public Noticia(long id, String titulo, String cuerpo, boolean eliminado, String foto) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.eliminado = eliminado;
        this.foto = foto;
    }

    

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Noticia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

   
}
