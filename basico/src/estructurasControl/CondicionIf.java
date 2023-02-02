package estructurasControl;

import java.util.Scanner;

public class CondicionIf{
    
    public static void main(String[] args){
        
        int age;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        
        age = scan.nextInt();
        
        if(age >= 18){
            
            System.out.println("El Usuario es Mayor de Edad");
            
        }else{
            
            System.out.println("El Usuario es Menor de Edad");
            
        }
        
        if(age >= 16 && age <= 18){
            
            System.out.println("El jugador puede participar con la Sub-18");
            
        }else{
            
            System.out.println("El jugador no puede participar en la Sub-18");
            
        }
        
    }
    
}
