package viejita;

import java.util.ArrayList;
import java.util.List;

public class Viejita {
    
    public static void ejecutar(){
        Inventario inventario = new Inventario();
        
        List<EstadoMexicano> estadosVestimenta1 = new ArrayList<>();
        estadosVestimenta1.add(EstadoMexicano.AGUASCALIENTES);
        estadosVestimenta1.add(EstadoMexicano.PUEBLA);
        Prendas vestimenta1 = new Prendas("Traje uno",estadosVestimenta1 , "Gala", 100.0, 50.0, 150.0);
        inventario.agregarPrenda(vestimenta1);
        
        List<EstadoMexicano> estadosVestimenta2 = new ArrayList<>();
        estadosVestimenta2.add(EstadoMexicano.CIUDAD_DE_MEXICO);
        estadosVestimenta2.add(EstadoMexicano.PUEBLA);
        Prendas vestimenta2 = new Prendas("Traje dos", estadosVestimenta2, "Común", 80.0, 40.0, 120.0);
        inventario.agregarPrenda(vestimenta2);
        
        List<EstadoMexicano> estadosVestimenta3 = new ArrayList<>();
        estadosVestimenta3.add(EstadoMexicano.AGUASCALIENTES);
        estadosVestimenta3.add(EstadoMexicano.PUEBLA);
        estadosVestimenta3.add(EstadoMexicano.BAJA_CALIFORNIA);
        estadosVestimenta3.add(EstadoMexicano.ESTADO_DE_MEXICO);
        Prendas vestimenta3 = new Prendas("Traje tres",estadosVestimenta3 , "Gala", 150.0, 70.0, 300.0);
        inventario.agregarPrenda(vestimenta3);
        
        Clientes clienteRegistrado1 = new Clientes("Juan", "Calle 123", "123456789", true);
         List<Prendas> prendasARentar1 = new ArrayList<>();
         prendasARentar1.add(vestimenta1);
         prendasARentar1.add(vestimenta2);
        inventario.rentarPrendas(prendasARentar1, clienteRegistrado1);
        
        Clientes clienteRegistrado2 = new Clientes("Javier", "Calle Desconocida", "987654321", false);
        List<Prendas> prendasAVender1 = new ArrayList<>();
        List<Prendas> prendasARentar2 = new ArrayList<>();
        prendasAVender1.add(vestimenta2);
        prendasARentar2.add(vestimenta3);
        inventario.venderPrendas(prendasAVender1, clienteRegistrado2);
        inventario.rentarPrendas(prendasARentar2, clienteRegistrado2);
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ejecutar();
    }
    
}
