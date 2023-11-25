package viejita;

public class Clientes {
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean pagoelectronico;

    public Clientes(String nombre, String direccion, String telefono, boolean pagoelectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pagoelectronico = pagoelectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isPagoelectronico() {
        return pagoelectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipopago(boolean pagoelectronico) {
        this.pagoelectronico = pagoelectronico;
    }
    
    
}
