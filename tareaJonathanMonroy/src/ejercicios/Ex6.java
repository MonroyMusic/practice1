package ejercicios;

import java.util.Scanner;
        
public class Ex6{
    
    public static void main(String[] args){
        
        int num;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un numero del 1 al 7: ");
        
        num = scan.nextInt();
        
        switch(num){
            
            case 1: System.out.println("Lunes");
                    break;
            case 2: System.out.println("Martes");
                    break;        
            case 3: System.out.println("Miercoles");
                    break;
            case 4: System.out.println("Jueves");
                    break;
            case 5: System.out.println("Viernes");
                    break;
            case 6: System.out.println("Sabado");
                    break;
            case 7: System.out.println("Domingo");
                    break;
            default: System.out.println("La semana solo tiene 7 dias");        
                    break;
                    
        }
        
    }
    
}
