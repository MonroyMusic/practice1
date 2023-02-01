package ejercicios;

import java.util.Scanner;

public class Ex2{
    
    public static void main(String[] args){
        
        int num1, num2, op;
        
        System.out.print("Ingrese el Primer Numero: ");
        
        Scanner scan = new Scanner(System.in);
        
        num1 = scan.nextInt();
        
        System.out.println("------------------");
        
        System.out.print("Ingrese el Segundo Numero: ");
        
        Scanner scan2 = new Scanner(System.in);
        
        num2 = scan2.nextInt();
        
        op = (num1 + num2) * (num1 - num2);
        
        System.out.println("------------------");
        
        System.out.println("El resultado de (" + num1 + " + " + num2 + ")(" + num1 + " - " + num2 + ") es igual a: " + op);
        
    }
    
}
