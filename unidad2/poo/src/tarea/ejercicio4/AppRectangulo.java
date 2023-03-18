/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class AppRectangulo{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int length, width;
        
        System.out.print("Ingrese el largo del Rectangulo: ");
        
        length = scan.nextInt();
        
        System.out.print("Ingrese el ancho del Rectangulo: ");
        
        width = scan.nextInt();
        
        Rectangulo rectangle = new Rectangulo(length, width);
        
        System.out.println("Area: " + rectangle.calculateArea());
        
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());        
        
        System.out.println(rectangle.isSquare());
        
    }
    
}
