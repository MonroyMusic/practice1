package estructurasControl;

import java.util.Scanner;

public class CondicionIf{
    
    public static void main(String[] args){
        
        int age;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        
        age = scan.nextInt();
        
        if(age > 18){
            
            System.out.println("El Usuario es Mayor de Edad");
            
        }
        
    }
    
}
