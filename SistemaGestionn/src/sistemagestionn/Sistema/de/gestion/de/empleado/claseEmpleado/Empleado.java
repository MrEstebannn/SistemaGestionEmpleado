/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionn.Sistema.de.gestion.de.empleado.claseEmpleado;

/**
 *
 * @author Duoc
 */
public class Empleado {
    private String idEmpleado; 
    private String nombre;
    private Double sueldoBase;         

    public Empleado(String idEmpleado, String nombre, Double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    
    
    public Empleado() {
    }
    
    public void calcularSalario(){


    }
}
