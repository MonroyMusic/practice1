package estructurasControl;

import java.util.Scanner;

public class Vocales{
    
    public static void main(String[] args){
        
        int vocal;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese una Vocal: ");
        
        vocal = scan.next().charAt(0);
        
        switch(vocal){
            
            case 'a': case 'A': 
                    System.out.println("Arandano, Annona, Aguacate, "
                            + "Albaricoque, Almendra");
                    break;
            case 'e': case 'E': 
                    System.out.println("Elote, Ejote");
                    break;
            case 'i': case 'I': 
                    System.out.println("Icaco, Ilama, Imbe");
                    break;  
            case 'o': case 'O': 
                    System.out.println("Olivias, Oroblanco");
                    break;
            case 'u': case 'U': 
                    System.out.println("Uvas, ...");
                    break;
            default: System.out.println("Ingreso un dato no valido");
                    break;
                    
        }
        
    }
    
}
