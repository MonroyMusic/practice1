package tipos;

import java.util.Scanner;

public class AreaCirculo{
    
    public static void main(String[] args){
        
        double radius, area;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Area del Circulo");
        
        System.out.println("-------------------");
        
        System.out.print("Ingrese el Radio del Circulo: ");
        
        radius = scan.nextDouble();
        
        area = Math.PI * Math.pow(radius, 2);
        
        System.out.println("El Area del circulo es de: " + area);        
    
    }
    
}
