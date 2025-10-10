/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionn.Sistema.de.gestion.de.empleado.claseEmpleado;
import java.util.ArrayList;
/**
 *
 * @author Duoc
 */
public class Departamento {
    private String idDepartamento;
    private String nombre;
    private ArrayList<Empleado> empleado;
    
    
    public void agregarEmpleado(Empleado e){
        empleado.add(e);
        
         
        
      
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public void calcularSalarioTotal(){
        
    }
}
