package estructurasControl;

import java.util.Scanner;

public class ListarNumeros01{
    
    public static void main(String[] args){
        
        int cant, i = 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese hasta que numero quiere imprimir: ");
        
        cant = scan.nextInt();
        
        while(i <= cant){
            
            System.out.println(i);
            
            i++;
            
        }
        
    }
    
}
