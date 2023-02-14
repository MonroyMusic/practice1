package arreglos;

import java.util.Scanner;

import java.util.Random;

public class Arreglo06{
    
    public static void main(String[] args) {
        
        int cant, suma = 0;
        
        Scanner scan = new Scanner(System.in);
        
        Random rand = new Random();
        
        System.out.print("De que dimension desea la matriz: ");
        
        cant = scan.nextInt();
        
        int[][] matrix = new int[cant][cant];
        
        for (int i = 0; i < cant; i++) {
            
            for (int j = 0; j < cant; j++) {
                
                matrix[i][j] = rand.nextInt(21);
                
            }
            
        }
        
        for (int i = 0; i < cant; i++) {
            
            for (int j = 0; j < cant; j++) {
                
                System.out.print(matrix[i][j] + "\t");
                
            }
            
            System.out.println("");
            
        }
        
        for (int i = 0; i < matrix.length; i++) {
            
            suma = suma + matrix[i][i];
            
        }
        
        System.out.println("La suma de la diagonal es igual a: " + suma);
        
    }
    
    
    
}
