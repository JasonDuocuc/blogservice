package com.huertohogar.blogservice;

public class BlogTip {
    public int id;
    public String titulo;
    public String contenido;

    // Constructor vacío
    public BlogTip() {}

    // Constructor para usar nosotros
    public BlogTip(int id, String titulo, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
    }
}