package tarea.ejercicio2;

import java.util.Scanner;

public class AppRectangulo{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int base, height;
        
        Rectangulo rectangle = new Rectangulo();
        
        System.out.print("Ingrese la Base del Rectangulo: ");
        
        base = scan.nextInt();
        
        rectangle.setBase(base);
        
        System.out.print("Ingrese la Altura del Rectangulo: ");
        
        height = scan.nextInt();
        
        rectangle.setHeight(height);
        
        System.out.println("El Area del rectangulo es de: " + 
                rectangle.calcularArea());
        
    }
    
}
