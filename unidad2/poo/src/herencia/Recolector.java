package herencia;

public class Recolector extends Robot{
    
    private int velocity;
    private int capacityWeight;

    private double fill;
    
    public void fillTrash(){
        
        System.out.println("Echando basura al depósito");
        
        for(int i = 0; i <= (this.capacityWeight * 0.7); i++ ){
            
            try{
            
                Thread.sleep(100);
                
                System.out.print(".");
                
                this.fill++;
                
            } catch(InterruptedException e){
            
            }
            
        }
        
        System.out.println("");
        
        this.compact();
        
    }
    
    private void compact(){
    
        System.out.println("Compactando Basura...");
        
        this.getOutTrash();
        
    }
    
    private void getOutTrash(){
        
        System.out.println("Tirando Basura...");
        
        this.fill = 0;
        
        System.out.println("El depósito está vacio");
        
    }
    
    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCapacityWeight() {
        return capacityWeight;
    }

    public void setCapacityWeight(int capacityWeight) {
        this.capacityWeight = capacityWeight;
    }     
    
    //TO DO: Metodo compactar basura
    
    public Recolector() {
   
        
        
    }
    
    public Recolector(String name) {
   
        setName(name);
        
    }
    
}
