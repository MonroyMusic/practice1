package sobreescritura;

public class AppSobreescritura{
    
    public static void main(String[] args) {
        
        Animal animal1 = new Animal();
        
        animal1.makeSound();
        
        Perro bodoque = new Perro();
        
        bodoque.makeSound();
        
    }
    
}
