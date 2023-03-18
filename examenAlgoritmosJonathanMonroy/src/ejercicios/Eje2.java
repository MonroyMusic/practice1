package ejercicios;

import java.util.Scanner;

import java.util.Random;

public class Eje2{
    
    public static void main(String[] args) {
        
        int rsize, csize, opc, major = 0, minor = 100;
        
        Scanner scan = new Scanner(System.in);
        
        Random rand = new Random();
        
        do {            
            
            System.out.print("De cauntas filas desea la matriz: ");
            rsize = scan.nextInt();
            
            System.out.print("De cauntas columnas desea la matriz: ");
            csize = scan.nextInt();
            
            int[][] matrix = new int[rsize][csize];
            
            for (int i = 0; i < rsize; i++) {
                
                for (int j = 0; j < csize; j++) {
                    
                    matrix[i][j] = rand.nextInt(100);
                    
                }
                
            }
            
            for (int i = 0; i < rsize; i++) {
                
                for (int j = 0; j < csize; j++) {
                    
                    System.out.print(matrix[i][j] + "\t");
                    
                }
                
                System.out.println("");
                
            }
            
            for (int i = 0; i < rsize; i++) {
                
                for (int j = 0; j < csize; j++) {
                    
                    if(matrix[i][j] > major){
                        
                        major = matrix[i][j];
                        
                    }
                    
                }
                
            }
            
            for (int i = 0; i < rsize; i++) {
                
                for (int j = 0; j < csize; j++) {
                    
                    if (matrix[i][j] < minor) {
                        
                        minor = matrix[i][j];
                        
                    }
                    
                }
                
            }
            
            
            
            System.out.println("El numero mayor en la matriz es: " + major + 
                    "\n");
            
            System.out.println("El numero menor en la matriz es: " + minor + 
                    "\n");
            
            System.out.print("Desea Continuar? (1/Si   2/No): ");
            
            opc = scan.nextInt();
            
        } while (opc == 1);
        
    }
    
}
