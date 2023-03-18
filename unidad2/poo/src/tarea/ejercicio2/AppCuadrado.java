package tarea.ejercicio2;

import java.util.Scanner;

public class AppCuadrado{
    
    public static void main(String[] args) {
        
        Cuadrado square = new Cuadrado();
        
        Scanner scan = new Scanner(System.in);
        
        int base;
        
        System.out.print("Ingrese el tamaño de un lado del cuadrado: ");
        
        base = scan.nextInt();
        
        square.setBase(base);

        System.out.println("El area del cuadrado es de: " + 
                square.calcularArea());
        
    }
    
}
