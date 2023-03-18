/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio4;

/**
 *
 * @author gonza
 */
public class Rectangulo {
    
    private int length;
    private int width;

    public Rectangulo(int l, int w) {
    
        setLenght(l);
        setWidth(w);
        
    }
    
    public int getLenght() {
        return this.length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int calculateArea(){
        
        int area, length, width;
        
        length = getLenght();
        
        width = getWidth();
        
        area = length * width;
        
        return area;
        
    }
    
    public int calculatePerimeter(){
        
        int perimeter, length, width;
        
        length = getLenght();
        
        width = getWidth();
        
        perimeter = 2 * (length + width);
        
        return perimeter;
        
    }
    
    public String isSquare(){
        
        String msg;
        
        int length, width;
        
        length = getLenght();
        
        width = getWidth();
        
        if(length == width){
            
            msg = "Es un Cuadrado";
            
        }else{
            
            msg = "No es un Cuadrado";
            
        }
        
        return msg;
        
    }
   
    
}
