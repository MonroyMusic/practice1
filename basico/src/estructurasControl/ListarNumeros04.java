package estructurasControl;

import java.util.Scanner;

public class ListarNumeros04{
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Cuantos numeros desea imprimir? :");
        
        num = scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            System.out.println(i);
            
        }
        
    }
    
}
