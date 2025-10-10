/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionn;

import sistemagestionn.Sistema.de.gestion.de.empleado.claseEmpleado.Empleado;

/**
 *
 * @author Duoc
 */
public class SistemaGestionn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
    private void probarEmpleado(){
       
        
      //Empleado 1 
      Empleado empleado1 = new Empleado("0a","Pepito",200000.0);
      
      System.out.println("Empleado 1");
      System.out.println(empleado1.getIdEmpleado());
      System.out.println(empleado1.getNombre());
      System.out.println(empleado1.getSueldoBase());
      System.out.println("===========");
     
      
      //Empleado 2 
      Empleado empleado2 = new Empleado();
      empleado2.setIdEmpleado("02");
      empleado2.setNombre("Juanito");
      empleado2.setSueldoBase(150000.0);
      
      System.out.println("Empleado 2");
      System.out.println(empleado2.getIdEmpleado());
      System.out.println(empleado2.getNombre());
      System.out.println(empleado2.getSueldoBase());
      System.out.println("===========");
      
      
      
      
    }
}
