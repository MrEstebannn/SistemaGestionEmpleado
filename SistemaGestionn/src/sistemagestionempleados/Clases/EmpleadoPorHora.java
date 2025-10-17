/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempleados.Clases;

import sistemagestionempleados.Interfaces.BonusCalculable;

/**
 *
 * @author Duoc
 */
public class EmpleadoPorHora extends Empleado implements BonusCalculable {
    private final int HorasTrabajadas;
    private final double PagoPorHora;

    public EmpleadoPorHora(int HorasTrabajadas, double PagoPorHora, String idEmpleado, String nombre, Double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
        this.HorasTrabajadas = HorasTrabajadas;
        this.PagoPorHora = PagoPorHora;
    }
    
    
    @Override
    public Double calcularBonus() {
        if(this.HorasTrabajadas > 80)
        return sueldoBase * 0.05;
        else
           return 0.0;
    }
    
    private Double Salario(){
    return (HorasTrabajadas * PagoPorHora)+ sueldoBase;
    }
            
    
    public double SueldoFinal(){
    
        return Salario() + calcularBonus();
        
    }
}
