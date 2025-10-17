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
public class EmpleadoAsalariado extends Empleado implements BonusCalculable {

    public EmpleadoAsalariado(String idEmpleado, String nombre, Double sueldoBase) {
        super(idEmpleado, nombre, sueldoBase);
    }

    @Override
    public Double calcularBonus() {
        return sueldoBase * 0.05;
    }
    
    public Double Salario(){
        return sueldoBase + calcularBonus();
    }
    
}