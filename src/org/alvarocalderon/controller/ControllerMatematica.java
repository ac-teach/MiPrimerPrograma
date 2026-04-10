
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
    
    public double promedio(int nota1, int nota2, int nota3){
        return (nota1+nota2+nota3) /3;
    }
    
    public double convertirTemperatura(double celcius){
        double farenheigt;
        
        farenheigt = celcius* (9/5) + 32;
        return farenheigt;
    }
    
}
