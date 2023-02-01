package ejercicios;

import java.util.Scanner;

public class Ex1{
    
    public static void main(String[] args){
        
        int num1, num2, s, r, m;
        double d;
        
        System.out.print("Ingrese el Primer Numero: ");
        
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        
        System.out.println("------------------");
        
        System.out.print("Ingrese el Segundo Numero: ");
        
        Scanner scan2 = new Scanner(System.in);
        
        num2 = scan2.nextInt();
        
        s = num1 + num2;
        r = num1 - num2;
        m = num1 * num2;
        d = num1 / num2;
        
        System.out.println("------------------");
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + s); 
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + r); 
        System.out.println("La multiplicacion de " + num1 + " x " + num2 + " es igual a: " + m); 
        System.out.println("La division de " + num1 + " / " + num2 + " es igual a: " + d); 
        
    }
    
}
