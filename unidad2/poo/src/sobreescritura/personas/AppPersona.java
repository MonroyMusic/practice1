package sobreescritura.personas;

public class AppPersona{
    
    public static void main(String[] args) {
        
        Persona people1 = new Persona(
                "Gonzalo Monroy",
                'M',
                18
        );
        
        System.out.println(people1.toString());
        
        Persona people2 = new Persona(
                "Lastenia Monroy",
                'F',
                23
        );
        
        System.out.println("----------------------");
        
        System.out.println(people2.toString());
        
    }
    
}
