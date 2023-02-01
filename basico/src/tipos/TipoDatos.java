package tipos;

import java.util.Scanner;

public class TipoDatos{
    
    public static void main(String[] args){
       
        int age;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        
        age = scan.nextInt();
        
        System.out.println("Su edad es: " + age);
        
    }
    
}
