package viejita;

import java.util.List;

public class Prendas {
    private String nombre;
    private List<EstadoMexicano> estados;
    private String categoria;
    private double costoproduccion;
    private double costorenta;
    private double costoventa;

    public Prendas(String nombre, List<EstadoMexicano> estados, String categoria, double costoproduccion, double costorenta, double costoventa) {
        this.nombre = nombre;
        this.estados = estados;
        this.categoria = categoria;
        this.costoproduccion = costoproduccion;
        this.costorenta = costorenta;
        this.costoventa = costoventa;
    }

    public String getNombre() {
        return nombre;
    }

    public List<EstadoMexicano> getEstados() {
        return estados;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getCostoproduccion() {
        return costoproduccion;
    }

    public double getCostorenta() {
        return costorenta;
    }

    public double getCostoventa() {
        return costoventa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstados(List<EstadoMexicano> estados) {
        this.estados = estados;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCostoproduccion(double costoproduccion) {
        this.costoproduccion = costoproduccion;
    }

    public void setCostorenta(double costorenta) {
        this.costorenta = costorenta;
    }

    public void setCostoventa(double costoventa) {
        this.costoventa = costoventa;
    }

    
    
}
