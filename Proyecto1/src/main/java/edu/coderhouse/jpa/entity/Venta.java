package edu.coderhouse.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table

public class Venta {

    public Venta(String comprobante, String mail_de_comprador, int seguimiento) {
        this.comprobante = comprobante;
        this.mail_de_comprador = mail_de_comprador;
        this.seguimiento = seguimiento;
    }

    @Column(name = "COMPROBANTE")
    private String comprobante ;

    @Column (name = "MAIL_DE_COMPRADOR")
    private String mail_de_comprador;

    @Column (name = "SEGUIMIENTO")
    private  int seguimiento;

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getMail_de_comprador() {
        return mail_de_comprador;
    }

    public void setMail_de_comprador(String mail_de_comprador) {
        this.mail_de_comprador = mail_de_comprador;
    }

    public int getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(int seguimiento) {
        this.seguimiento = seguimiento;
    }
}
