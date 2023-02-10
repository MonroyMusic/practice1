package arreglos;

import java.util.Scanner;

public class Arreglo05{
    
    public static void main(String[] args) {
        
        //El Usuario determina el tamaño de la matriz
        //El Usuario Ingresa los datos de la matriz
        
        int r, c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Cuantas Filas desea colocar: ");
        
        r = scan.nextInt();
        
        System.out.print("Cuantas Columnas desea colocar: ");
        
        c = scan.nextInt();
        
        int[][] matrix = new int[r][c];
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print("Ingrese el valor de la posicion[" + i + ", " 
                + j + "]: ");
                
                matrix[i][j] = scan.nextInt();
                
            }
            
        }
        
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                
                System.out.print(matrix[i][j] + "\t");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
