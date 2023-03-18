package arreglos;

/**
 * Crear un numero en el cual se ingrese un numero de una tabla que se quiera
 * visualizar e ingresar otro numeropara la cantidad de multiplos a generar
 * almacenar los valores en una matriz y mostrar los datos al finalizar el 
 * proceso.
 */

import java.util.Scanner;

public class Arreglo07{
    
    public static void main(String[] args) {
        
        int num, mult, opc;
                
        Scanner scan = new Scanner(System.in);
        
        System.out.print("De que numero desea ver los multiplos: ");
        
        num = scan.nextInt();
        
        do {            
            
            System.out.print("Ingreso los multiplos a mostrar: ");
        
            mult = scan.nextInt();
        
            int[][] matrix = new int[mult][3];
        
            for (int i = 0; i < mult; i++) {
                 
                matrix[i][2] = num * (i + 1);  
                
            }
        
            for (int i = 0; i < mult; i++) {
            
                System.out.println(num + " x " + (i+1) + " = " + matrix[i][2]);
            
            }
            
            System.out.print("Desea Continuar? 1/Si 2/No: ");
            
            opc = scan.nextInt();
            
        } while (opc == 1);
        
    }
    
}
