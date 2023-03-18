package ejercicios;

import java.util.Scanner;

import java.util.Random;

public class Eje3{
    
    public static void main(String[] args) {
        
        int cant, repeat = 0, opc;
        
        Scanner scan = new Scanner(System.in);
        
        Random rand = new Random();
        
        do {            
            
            System.out.print("Cuantos números desea generar: ");
            
            cant = scan.nextInt();
            
            int[] list = new int[cant];
            
            for (int i = 0; i < cant; i++) {
                
                list[i] = rand.nextInt(10) + 1;
                
                System.out.println(list[i]);
               
            }
            
            repeat = list[0];
            
            for (int i = 0; i < cant; i++) {
                
                if(list[i] == list[i]){
                        
                    if(repeat == list[i]){
                        
                        repeat = list[i];
                        
                    }
                    
                }
             
            }
            
            if (repeat > 0) {
                
                System.out.println("El numero mas comun es: " + repeat);
                
            }else{
                
                System.out.println("Ningun número se repite");
                
            }
            
            System.out.print("Desea Continuar? (1/Si   2/No): ");
            
            opc = scan.nextInt();
            
        } while (opc == 1);
        
    }
    
}
