package herencia;

public class AppRobot{
    
    public static void main(String[] args) {
        
        Recolector r = new Recolector("Wall-e");
        
        Recolector t = new Recolector("Terminator");
        
        System.out.println(r.getName());
        
        r.setCapacityWeight(100);
        
        r.fillTrash();
        
        System.out.println(t.getName());
        
    }
    
}
