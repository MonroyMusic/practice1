package estructurasControl;

import java.util.Scanner;

public class Promedio{
    
    public static void main(String[] args){
        
        double note1, note2, note3, prom;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la Primer Nota: ");
        
        note1 = scan.nextDouble();
        
        System.out.print("Ingrese la Segunda Nota: ");
        
        note2 = scan.nextDouble();
        
        System.out.print("Ingrese la Tercer Nota: ");
        
        note3 = scan.nextDouble();
        
        prom = (note1 + note2 + note3) / 3;
        
        if(prom < 70){
            
            System.out.println("El estudiante reprobo con un promedio de: " + prom);
            
        }else if(prom >= 70 && prom < 80){
            
            System.out.println("El alumno aprobo con un promedio de: " + prom);
            
        }else if(prom >= 80 && prom < 90){
            
            System.out.println("El alumno aprobo con un promedio bueno de: " + prom);
            
        }else if(prom >= 90 && prom<=100){
            
            System.out.println("El alumno aprobo con un promedio sobresaliente de: " + prom);
            
        }
        
    }
    
}
