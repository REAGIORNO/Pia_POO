package com.piapoo;

public class Cotizacion {
    private Autos auto;
    private Integer planFinanciamiento;
    private Integer personalidadFiscal;
    private Integer enganche;
    private Integer plazo;
    private Integer aseguradora;
    private Integer tipoPago;

    public Cotizacion(Autos auto, Integer planFinanciamiento, Integer personalidadFiscal, Integer enganche, Integer plazo, Integer aseguradora, Integer tipoPago) {
        this.auto = auto;
        this.planFinanciamiento = planFinanciamiento;
        this.personalidadFiscal = personalidadFiscal;
        this.enganche = enganche;
        this.plazo = plazo;
        this.aseguradora = aseguradora;
        this.tipoPago = tipoPago;
    }
}