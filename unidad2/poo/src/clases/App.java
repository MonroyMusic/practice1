package clases;

public class App{
    
    public static void main(String[] args) {
        
        Producto product = new Producto();
        
        System.out.println("");
        
        product.setName("Semitas");
        
        System.out.println("Codigo del producto: " + product.getCode());
        
        System.out.println("Nombre del producto: " + product.getName());
        
    }
    
}
