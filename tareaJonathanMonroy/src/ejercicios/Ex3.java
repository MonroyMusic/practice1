package ejercicios;

import java.util.Scanner;

public class Ex3{
    
    public static void main(String[] args){
        
        int cant, price, total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad a comprar del producto: ");
        
        cant = scan.nextInt();
        
        System.out.println("----------------");
        
        Scanner scan2 = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        
        price = scan2.nextInt();
       
        total = cant * price;
        
        System.out.println("----------------");
        
        System.out.println("El total a pagar es de: " + total);
        
    }
    
}
