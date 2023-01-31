package tipos;

import java.util.Scanner;

public class Leer{

    public static void main(String[] args){
        
        // Tipo de dato
        // Indicar el nombre
        // (Opcional) Agregar un valor a la variable
        
        Scanner scanner = new Scanner(System.in);      
        
        System.out.print("Ingrese Su Nombre: ");
        String name = scanner.nextLine();
        
        System.out.println("------------------");
        System.out.println("Hello " + name);
        
    }

}

