/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempleados.Clases;

import java.util.ArrayList;

/**
 *
 * @author Duoc
 */
public class Departamento {
    private String idDepartamento;
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String idDepartamento, String nombre, ArrayList<Empleado> empleados) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Departamento() {
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
    
    public void agregarEmpleado(Empleado e){
    
    this.empleados.add(e);
    
    }
    
    public void calcularCostoTotalSalarios(){};
}

