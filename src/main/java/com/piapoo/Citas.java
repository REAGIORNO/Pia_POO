package com.piapoo;

import java.util.Date;

public class Citas {
    private Cliente cliente;
    private Ubicacion ubicacion;
    private Date horario;
    private String servicio;

    public Citas(Cliente cliente, Ubicacion ubicacion, Date horario, String servicio) {
        this.cliente = cliente;
        this.ubicacion = ubicacion;
        this.setHorario(horario);
        this.setServicio(servicio);
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
}
