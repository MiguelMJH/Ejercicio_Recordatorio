package viejita;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Prendas> prendas;

    public Inventario() {
        prendas = new ArrayList<>();
    }
    
    public void agregarPrenda(Prendas prenda) {
        prendas.add(prenda);
    }
    
    public void rentarPrendas(List<Prendas> prendas, Clientes cliente) {
        double costoTotalRenta = 0;
        for (Prendas prenda : prendas) {
            costoTotalRenta += prenda.getCostorenta();
        }
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Prendas a rentar:");
        for (Prendas prenda : prendas) {
            System.out.println("- " + prenda.getNombre());
        }
        System.out.println("Costo total de renta: $" + costoTotalRenta);
    }
    
    public void venderPrendas(List<Prendas> prendas, Clientes cliente) {
        double costoTotalVenta = 0;
        for (Prendas prenda : prendas) {
            costoTotalVenta += prenda.getCostoventa();
        }
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Prendas a vender:");
        for (Prendas prenda : prendas) {
            System.out.println("- " + prenda.getNombre());
        }
        System.out.println("Costo total de venta: $" + costoTotalVenta);
    }
    
}
