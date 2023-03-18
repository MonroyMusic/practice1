package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Eje1{
    
    public static void main(String[] args) {
        
        int size, opc;
        
        Scanner scan = new Scanner(System.in);
        
        Random rand = new Random();
        
        do {            
            
            System.out.print("De que tamaño desea la matriz?: ");
            
            size = scan.nextInt();
            
            int[][] matrix = new int[size][size];
            
            int[] row = new int[size];
            int[] col = new int[size];
            
                    
            for (int i = 0; i < size; i++) {
                
                for (int j = 0; j < size; j++) {
                    
                    matrix[i][j] = rand.nextInt(100) + 1; 
                    
                }
                
            }
            
            for (int i = 0; i < size; i++) {
                
                for (int j = 0; j < size; j++) {
                    
                    System.out.print(matrix[i][j] + "\t");
                    
                }
             
                System.out.println("");
                
            }
            
            for (int i = 0; i < size; i++) {
                
                for (int j = 0; j < size; j++) {
                    
                    row[i] += matrix[i][j];
                    
                    
                    
                }
                
                System.out.println("Suma de la fila " + (i + 1) + " = "
                        + row[i]);
                System.out.println("");
                
            }
            
            for (int i = 0; i < size; i++) {
                
                for (int j = 0; j < size; j++) {
                    
                    col[i] += matrix[j][i];
                    
                }
                
                System.out.println("Suma de la columna " + (i + 1) + " = "
                        + col[i]);
                System.out.println("");
                
                
                
            }
            
            System.out.print("Desea Continuar? (1/Si   2/No): ");
            
            opc = scan.nextInt();
            
        } while (opc == 1);
        
    }

    
}
