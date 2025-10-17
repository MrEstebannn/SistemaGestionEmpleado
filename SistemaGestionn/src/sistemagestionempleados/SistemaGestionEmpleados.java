/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionempleados;

import sistemagestionempleados.Clases.EmpleadoAsalariado;
import sistemagestionempleados.Interfaces.BonusCalculable;

/**
 *
 * @author Duoc
 */
public class SistemaGestionEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        probarEmpleados();
        
          
    }
    
    private static void probarEmpleados(){
    
    //Empleado 1
    EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("01","Pepito",2000000.0);

    System.out.println("EMPLEADO 1");
    System.out.println(empleado1.getIdEmpleado());
    System.out.println(empleado1.getNombre());
    System.out.println(empleado1.sueldoBase);
     System.out.println("============================");
     
     BonusCalculable bonoEmpleado1 = empleado1;
     System.out.println("BONO EMPLEADO 1:" +bonoEmpleado1.calcularBonus());
    
    }
    
}
