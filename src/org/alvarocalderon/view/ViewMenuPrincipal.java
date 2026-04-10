package org.alvarocalderon.view;
import java.util.Scanner;
import org.alvarocalderon.controller.ControllerMatematica;

public class ViewMenuPrincipal {
   //global
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);
    
    public void mostrarMenu(){
        //local
        do{
             System.out.println("Binevenido, Seleccione una opción:");
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones de texto");
            System.out.println("3. Operaciones de lógica");
            System.out.println("4. Salir del sistema");
            opcionMenu = Integer.parseInt(leer.nextLine());
            
            switch (opcionMenu){
                case 1:
                    mostrarMenuMatematica();
                    break;

            }
            
        } while (opcionMenu != 4);
    }
    
    public void mostrarMenuMatematica(){
        int opcionMatematica = 0;
        ControllerMatematica matematica = new ControllerMatematica();
        
        do{
            System.out.println("Menu de operaciones matemáticas");
            System.out.println("1. Calcular salario");
            opcionMatematica = Integer.parseInt(leer.nextLine());
            
            switch (opcionMatematica){
                case 1:
                    System.out.println("Indique las hora trabajadas");
                    int horas = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique el costo por hora");
                    double costo = Double.parseDouble(leer.nextLine());
                    double total = matematica.calcularSalario(horas,costo);
                    
                    System.out.println("El salario es:  "+ total);
            }
            
        }while (opcionMatematica != 0);
        
    }
}
