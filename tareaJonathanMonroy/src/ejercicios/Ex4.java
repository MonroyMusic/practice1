package ejercicios;

import java.util.Scanner;

public class Ex4{
    
    public static void main(String[] args){
        
        int a, b, c, d, e, f, g, h, i, opc;
        
        double result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("a) 3/2 + 4/3");
        System.out.println("b) 1/(x-5) - 3xy/4");
        System.out.println("c) 1/2+7");
        System.out.println("d) 7 + 1/2");
        System.out.println("e) a^2/(b-c) + d-e/(f-(g*h/j))");
        System.out.println("f) m/n + p");
        System.out.println("g) m + n/(p-q)");
        System.out.println("h) a^2/(b^2) + c^2/(d^2)");
        System.out.println("i) (m + (n/p)) / (q + (r/s))");
        System.out.println("j) (3a + b) / (c - (d+5e/(f + g/2h))");
        System.out.println("k) (a^2+2ab+b^2) / (1/(x^2))+2");
        
        System.out.println("-------------------------");
        
        System.out.print("Que ecuacion desea realizar?: ");
        
        opc = scan.next().charAt(0);
        
        switch (opc) {
            case 'a', 'A' -> {
                
                result = (3/2) + (4/3);
                
                System.out.println("3/2 + 4/3 = " + result);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                
            }
            case 'b', 'B' -> {
                
                System.out.println("Ingrese los valores de x y de y:");
                
                a = scan.nextInt();
                b = scan.nextInt();
                
                result = (1/(a-5)) - (3 * a * b/4);
                
                System.out.println("1/(x-5) - 3*x*y/4 = " + result);
            }
            default -> System.out.println("Ingreso un dato no valido");
        }
        
    }
    
}
