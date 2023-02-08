package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex5{
    
    public static void main(String[] args){
        
        int num, tries = 0, adv, cond=1;
        
        Random rand = new Random();
        
        Scanner scan = new Scanner(System.in);
          
        num = rand.nextInt(21);
        
        while(cond == 1){
            
            int i = 0;
            
            for(i=0; i<3; i++){
                
                System.out.print("Intente adivinar el numero: ");
                adv = scan.nextInt();
            
                tries++;
            
                if(adv == num){
                
                    System.out.println("FELICIDADES ADIVINASTE EL NUMERO");
                    break;
                
                }else{ 
                
                    System.out.println("Intenta Nuevamente");
                
                }
                    
                if(tries == 3){
                    
                    System.out.println("Lo siento, no pudiste adivinar"
                     + "el numero. El numero era: " + num);
                    
                }
       
            }
           
            System.out.print("Desea seguir Jugando? (1/Si - 2/No): ");
                
            cond = scan.nextInt();
            
            if(cond == 1){
                
                num = rand.nextInt(21);
                tries = 0;
                
            }
            
        }
             
        
        
    }
    
}
