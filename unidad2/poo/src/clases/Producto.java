package clases;

import java.util.UUID;

public class Producto{
    
    // Atributos o Propiedades => Variables de Clase
    
    private String code; //TO DO: Generar código de forma automática 
    private String name;
    private double price;
    private int stock;
    private String color;
    private String brand;
    private String description;
    
    //Metodo Constructor
    
    public Producto(){
        
        UUID uuid = UUID.randomUUID();
        
        this.code = uuid.toString();
        
    }
    
    // Métodos (Funciones)
    
    public String getCode(){
        
        return this.code;
        
    }
    
    public void setName(String name){
        
        this.name = name;
        
    }
    
    public String getName(){
        
        return this.name;
        
    }
    
    public void setPrice(double price){
        
        this.price = price;
        
    }
    
    public double getPrice(){
        
        return this.price;
        
    }
    
    public void setStock(int stock){
        
        this.stock = stock;
        
    }
    
    public int getStock(){
        
        return this.stock;
        
    }
    
    public void setColor(String color){
        
        this.color = color;
        
    }
    
    public String getColor(){
        
        return this.color;
        
    }
    
    public void setBrand(String brand){
        
        this.brand = brand;
        
    }
    
    public String getBrand(){
        
        return this.brand;
        
    }
    
    public void setDescription(String description){
        
        this.description = description;
        
    }
    
    public String getDescription(){
        
        return this.description;
        
    }
    
}
