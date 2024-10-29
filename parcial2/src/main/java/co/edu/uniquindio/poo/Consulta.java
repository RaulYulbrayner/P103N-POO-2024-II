package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Consulta {
    private String codigo;
    private TipoConsulta tipoConsulta;
    private String fecha;
    private List<String> tratamientos;
    private double costoTotal;

    public Consulta(String codigo, TipoConsulta tipoConsulta, String fecha) {
        this.codigo = codigo;
        this.tipoConsulta = tipoConsulta;
        this.fecha = fecha;
        this.tratamientos = new LinkedList<>();
    }

    public void agregarTratamiento(String tratamiento) {
        tratamientos.add(tratamiento);
    }

    public void calcularCosto(PersonalApoyo medico) {
        costoTotal = medico.calcularCostoConsulta();
    }

    public double getCostoTotal() {
        return costoTotal; 
    }

    public List<String> getTratamientos() {
        return tratamientos;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipoConsulta + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tratamientos=" + tratamientos +
                ", costoTotal=" + costoTotal +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTratamientos(List<String> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

}
