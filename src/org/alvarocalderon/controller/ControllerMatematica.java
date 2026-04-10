
package org.alvarocalderon.controller;


public class ControllerMatematica {
    
    public double calcularSalario(int horas, double costo){
        double totalSalario = horas * costo;
        return totalSalario;
    }
    
    public double calcularAreaTriangulo(int base, int altura){
        double area;
        area = (base * altura) /2;
        
        return area;
    }
    
}
