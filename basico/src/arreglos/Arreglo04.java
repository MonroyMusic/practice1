package arreglos;

public class Arreglo04{
    
    public static void main(String[] args) {
            
        int[][] matrix = new int[3][3];
        
        for (int r = 0; r < 3; r++) {
            
            for (int c = 0; c < 3; c++) {
                
                matrix[r][c] = r + c;
                
                System.out.print(matrix[r][c] + "\t");
                
            }
            
            System.out.print("\n");
            
        }
        
        
    }
    
}
