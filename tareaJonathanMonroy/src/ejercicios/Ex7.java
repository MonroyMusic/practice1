package ejercicios;

import java.util.Scanner;

public class Ex7{
    
    public static void main(String[] args){
        
        int num, i;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese de que numero quiere concer los multiplos del 1 al 10: ");
        
        num = scan.nextInt();
        
        for(i=0; i <=9; i++){
            
            int calc;
            
            calc = num * (i+1);
            System.out.println(num + " x " + (i+1) + " = " + calc);
            
        }
        
    }
    
}
