package arreglos;

import java.util.Random;

public class Arreglo02{
    
    public static void main(String[] args) {
        
        int[] numbers = new int[20];
        
        Random rand = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = rand.nextInt(100) + 1;
            
            System.out.println("Numero [" + i + "] = " + numbers[i]);
            
        }
        
    }
    
}
