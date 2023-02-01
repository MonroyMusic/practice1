package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex5{
    
    public static void main(String[] args){
        
        int num, tries = 0, adv;
        
        Random rand = new Random();
        
        num = rand.nextInt(21);
        
        Scanner scan = new Scanner(System.in);
        
        if(tries < 3){
            
            System.out.print("Intente adivinar el numero");
            adv = scan.nextInt();
            
            if(adv == num){
                
                System.out.println("FELICIDADES ADIVINASTE EL NUMERO");
                
            }
            
        }
        
    }
    
}
