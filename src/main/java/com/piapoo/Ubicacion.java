package com.piapoo;

public class Ubicacion {
    private String calle;
    private String numero;
    private String codigoPostal;
    private String municipio;
    private String estado;

    public Ubicacion(String calle,String numero,String codigoPostal,String municipio,String estado) {
        this.setCalle(calle);
        this.setNumero(numero);
        this.setCodigoPostal(codigoPostal);
        this.setMunicipio(municipio);
        this.setEstado(estado);
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
