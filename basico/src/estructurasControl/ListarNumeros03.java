package estructurasControl;

import java.util.Scanner;

public class ListarNumeros03{
    
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        
        int option = 1;
        
        do {            
            
            int cant, i = 1;
        
            System.out.print("Ingrese hasta que numero quiere imprimir: ");
        
            cant = scan.nextInt();
        
            while(i <= cant){
            
                System.out.println(i);
            
                i++;
            
            }
            
            System.out.print("Desea Continuar? 1 = Si/ 2 = No: ");
            
            option = scan.nextInt();
            
        } while (option == 1);
        
    }
    
}