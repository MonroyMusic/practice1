package foros;

import java.util.Scanner;

public class Matrices{
    
    public static void main(String[] args) {
        
        int row, col;
        
        double aum = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa para calcular aumento de el 10% del "
                + "sueldo en x meses de x empleados");
        
        System.out.println("----------------------------------------------");
        
        System.out.print("Ingrese la cantidad de empleados: ");
        
        row = scan.nextInt();
        
        System.out.print("Ingrese cauntos meses se les ha pagado a los"
                + " empleados: ");
        
        col = scan.nextInt();
        
        int[][] matrix = new int[row][col];
        
        int[] rowp = new int[col];
        
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                
                System.out.print("Ingrese el pago del " + (i+1) + "° empleado"
                        + " en el " + (j+1) + "° mes: ");
                
                matrix[i][j] = scan.nextInt();
                
            }
            
            System.out.println("");
            
        }
        
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                
                System.out.print(matrix[i][j] + "\t");
                
            }
            
            System.out.println("");
        }
        
        for (int i = 0; i < row; i++) {
                
            for (int j = 0; j < col; j++) {
                    
                rowp[i] += matrix[i][j];
                
                aum = (rowp[i] / col) * 0.10;
                
            }
                
                System.out.println("El aumento del empleado " + (i + 1) + "sera"
                        + " de: " + aum);
                System.out.println("");
                
        }
        
    }
    
}
