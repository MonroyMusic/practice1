package sobreescritura.personas;

import java.util.Scanner;

public class AppPersonaArray{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cant, age;
        
        String name, cellphone, id, nationality;
        
        double height;
        
        char genere;
        
        System.out.print("Cuantas personas desea ingresar: ");
        
        cant = scan.nextInt();
        
        Persona[] personas = new Persona[cant];
        
        for (int i = 0; i < cant; i++) {
            
            scan.nextLine();
            
            System.out.print("Ingrese el nombre de la Persona " + (i+1) +
                    ": ");
            
            name = scan.nextLine();
            
            System.out.print("Ingrese el genero de la Persona " + (i+1) +
                    "(M/F): ");
            
            genere = scan.nextLine().charAt(0);
            
            System.out.print("Ingrese la edad de la Persona " + (i+1) +
                    ": ");
            
            age = scan.nextInt();
            
            System.out.print("Ingrese el número de teléfono"
                    + " de la Persona " + (i+1) +
                    ": ");
            
            cellphone = scan.nextLine();
            
            scan.nextLine();
            
            System.out.print("Ingrese la identidad de la Persona " + (i+1) +
                    ": ");
            
            id = scan.nextLine();
            
            System.out.print("Ingrese la estatura de la Persona " + (i+1) +
                    ": ");
            
            height = scan.nextDouble();
            
            System.out.print("Ingrese la nacionalidad de la Persona " + (i+1) +
                    ": ");
            
            nationality = scan.nextLine();
            
            personas[i] = new Persona(name, genere, age, cellphone, id, height,
             nationality);
            
            
        }
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Persona " + (i+1));
            
            personas[i].toString();
            
        }
        
    }
    
}
