package estructurasControl;

import java.util.Scanner;

public class ListarNumeros02{
    
    public static void main(String[] args){
        
        int cant, i = 1;
        
        boolean continues = true;
        
        Scanner scan = new Scanner(System.in);
        
        while(continues == true){
            
           System.out.print("Ingrese hasta que numero quiere imprimir: ");
        
            cant = scan.nextInt();
        
            while(i <= cant){
            
                System.out.println(i);
            
                i++;
            
            }
            
            System.out.print("Desea Continuar? (S/N): ");
            
            String answer = scan.next().toLowerCase();
            
            continues = answer.equalsIgnoreCase("s");
            
            
            
        }
        
    }
    
}
