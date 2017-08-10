
package tarea3;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */

public class palindromo {
    public void palabra(){
        String palab;
            
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Palabras Palindromas------------");
        System.out.println("--------------Ingresar palabra---------------");
        palab = sc.nextLine();
        
        if(espalindroma(palab)){
            System.out.println("¡SI ES PALINDROMA!");   
        }else{
            System.out.println(":V ¡NO ES PALINDROMA! T_T");
        }

          
    }
    
    public static boolean espalindroma(String palab){
        //elimina los espacios
         String aux="";
        int n = palab.length();
        for(int i = 0; i < n; i++){
            if(!(palab.substring(i,i + 1).equals(" ")
                    ||palab.substring(i,i + 1).equals(" ,"))){
              aux +=palab.substring(i,i + 1);
            
            }
        }
        //comparamos las posiciones
        n = aux.length();
        for(int i = 0; i < n /2; i++){
            if(!aux.substring(i, i + 1).equals(aux.substring(n - i - 1,n -  i))){
                return false;
            }
        }
        return true;
    }

    
}
