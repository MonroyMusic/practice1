package arreglos;

import java.util.Random;

import java.util.Scanner;

public class Arreglo03{
    
    public static void main(String[] args) {
        
        int[] numbers = new int[20];
        
        Scanner scan = new Scanner(System.in);
        
        int option = 1;
                
        Random rand = new Random();
        
        do {            
            
            for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = rand.nextInt(100) + 1;
            
            System.out.println("Numero [" + i + "] = " + numbers[i]);
            
            
        }
            
            System.out.println("-------------------");
                
            System.out.print("Desea Generar un nuevo arreglo? 1/Si 2/No: ");
            
            option = scan.nextInt();
            
        } while (option==1);
        
        
        
    }
    
}
