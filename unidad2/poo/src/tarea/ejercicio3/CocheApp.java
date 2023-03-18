/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio3;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class CocheApp {
    
    public static void main(String[] args) {
        
        Coche car = new Coche(0);
        
        int opc;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Desea Acelerar?(1/Si  2/No): ");
        
        opc = scan.nextInt();
        
        if(opc == 1){
            
            car.arrancar();
            
            int time;
            
            System.out.print("Cuanto tiempo (seg) desea acelerar?: ");
            
            time = scan.nextInt();
            
            System.out.println("Velocidad: " + car.acelerar(time) + 
                    " m/s" );
            
            System.out.print("Desea seguir acelerando? 1/Si  2/No: ");
            
            opc = scan.nextInt();
            
            do {                
                
                System.out.print("Cuanto tiempo (seg) desea acelerar?: ");
            
                time = scan.nextInt();
                
                System.out.println("Velocidad: " + car.acelerar(time) 
                        + " m/s");
                
                System.out.print("Desea seguir acelerando? 1/Si  2/No: ");
            
                opc = scan.nextInt();
                
            } while (opc == 1);
            
            System.out.println("Desacellerando...");
            
            System.out.println(car.frenar() + " m/s");
            
            System.out.print("Desea detenerse?: 1/Si   2/No");
            
            opc = scan.nextInt();
            
            if(opc == 1){
                
                System.out.println(car.detener() + " m/s");
                
            }
            
            
        }else{
            
            System.out.println("Final");
            
            
        }
        
        
    }
    
}
