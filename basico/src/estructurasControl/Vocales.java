package estructurasControl;

import java.util.Scanner;

public class Vocales{
    
    public static void main(String[] args){
        
        int vocal;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese una Vocal: ");
        
        vocal = scan.next().charAt(0);
        
        switch(vocal){
            
            case 'a', 'A' -> System.out.println("Arandano, Annona, Aguacate, "
                    + "Albaricoque, Almendra");
            case 'e', 'E' -> System.out.println("Elote, Ejote");
            case 'i', 'I' -> System.out.println("Icaco, Ilama, Imbe");
            case 'o', 'O' -> System.out.println("Olivias, Oroblanco");
            case 'u', 'U' -> System.out.println("Uvas, ...");
            default -> System.out.println("Ingreso un dato no valido");
                    
        }
        
    }
    
}
