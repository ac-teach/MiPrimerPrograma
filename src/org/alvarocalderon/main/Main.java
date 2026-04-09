package org.alvarocalderon.main;
import org.alvarocalderon.view.ViewMenuPrincipal;

/**
 *
 * @author Alvaro Calderón
 */
public class Main {
    public static void main(String[] args) {
        //tipo dato, nombre, valores
        //instanciar <- new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        
        System.out.println("Mi primer programa");
        menu.mostrarMenu();
    }
    
}
