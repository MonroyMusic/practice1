package ejercicios;

import java.util.Scanner;

public class Ex8{
    
    public static void main(String[] args){
        
        int x, y, multi=1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese de que número desea ver sus multiplos: ");
        
        x = scan.nextInt();
        
        System.out.print("Ingrese cuantos multiplos desea mostrar: ");
        
        y = scan.nextInt();
        
        while(multi <= y){
            
            System.out.println(x + " x " + multi + " = " + x * multi);
            
            multi++;
        }
        
    }
    
}
