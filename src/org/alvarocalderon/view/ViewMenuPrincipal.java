package org.alvarocalderon.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
   //global
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);
    
    public void mostrarMenu(){
        //local
        while (opcionMenu == 0){
            System.out.println("Binevenido, Seleccione una opción:");
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones de texto");
            System.out.println("3. Operaciones de lógica");
            System.out.println("4. Salir del sistema");
            opcionMenu = Integer.parseInt(leer.nextLine());

        }
    }
    
    public void mostrarMenuMatematica(){
        System.out.println("Menu de operaciones matemáticas");
    }
}
