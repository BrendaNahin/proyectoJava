package edu.coderhouse.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Productos {

    public Productos(String nombre, String marca, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    @Column(name = "NOMBRE")
    private String nombre ;

    @Column (name = "MARCA")
    private String marca;

    @Column (name = "CANTIDAD")
    private  int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
