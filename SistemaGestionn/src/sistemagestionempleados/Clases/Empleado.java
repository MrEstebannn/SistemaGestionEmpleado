/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempleados.Clases;

/**
 *
 * @author Duoc
 */
public abstract class Empleado {
    private String idEmpleado;
    private String nombre;
    public Double sueldoBase;

    public Empleado(String idEmpleado, String nombre, Double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void calcularSalario(){
        
    }
    
    public abstract Double calcularBonus(); 
}
