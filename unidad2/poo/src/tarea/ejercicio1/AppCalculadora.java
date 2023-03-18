package tarea.ejercicio1;

import java.util.Scanner;

public class AppCalculadora{
    
    public static void main(String[] args) {
        
        int opc, n1, n2;
        
        Scanner scan = new Scanner(System.in);
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Que operación desea realizar? \n1) Suma\n"
                + "2) Resta\n3) Multiplicación\n4) División");
        
        opc = scan.nextInt();
        
        switch (opc) {
            case 1: System.out.print("Ingrese el primer número: ");
                n1 = scan.nextInt();
                System.out.print("Ingrese el primer número: ");
                n2 = scan.nextInt();
                calc.suma(n1, n2);
                
                System.out.print("El Resultado es: " + calc.result);
                
                break;
            
            case 2: System.out.print("Ingrese el primer número: ");
                n1 = scan.nextInt();
                System.out.print("Ingrese el primer número: ");
                n2 = scan.nextInt();
                calc.resta(n1, n2);
                
                System.out.print("El Resultado es: " + calc.result);
                
                break;
                
            case 3: System.out.print("Ingrese el primer número: ");
                n1 = scan.nextInt();
                System.out.print("Ingrese el primer número: ");
                n2 = scan.nextInt();
                calc.multiplicacion(n1, n2);
                
                System.out.print("El Resultado es: " + calc.result);
                
                break;
                
            case 4: System.out.print("Ingrese el primer número: ");
                n1 = scan.nextInt();
                System.out.print("Ingrese el primer número: ");
                n2 = scan.nextInt();
                calc.division(n1, n2);
                
                System.out.print("El Resultado es: " + calc.result);
                
                break;    
                
            default:
                System.out.println("Ingrese una opción válida");;
        }
        
    }
    
}
