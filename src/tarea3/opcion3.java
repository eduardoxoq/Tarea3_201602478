
package tarea3;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class opcion3 {
    
    public void menu(){
        boolean salir = false;
        int numero;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Menu de Usuarios");            
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar todos los usuarios");
        System.out.println("3. Mostrar un usuario perzonalizado");
        System.out.println("4. Menu Principal");
        System.out.println("5. Salir");
        
        numero = sn.nextInt();
        
        switch(numero){
            case 1:                
                System.out.println("saama");
                break;
            case 2:
                 System.out.println("2");
               
                break; 
             case 3:
                 salir = true;
                System.out.println("s33");  
                break;
             case 4:
                 salir = true;
                System.out.println("444a");  
                break;
             case 5:
                 salir = true;
                System.out.println("s55a");  
                break;                
            default:
               System.out.println("Elije una opcion de 1 al 5");               
        }
    }
    
    
}
