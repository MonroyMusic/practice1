/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio3;

/**
 *
 * @author gonza
 */
public class Coche extends Vehiculo{
    
    private double velocity = 0;

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    
    public double acelerar(int seconds){
        
        for (int i = 0; i < seconds; i++) {
            
            velocity += 20;
            
        }
        
        return velocity;
                             
    }
    
    public double frenar(){

        velocity -= 20;
        
        return velocity;
                
    }

    public Coche(double velocity) {
        
        setVelocity(velocity);
        
    }
    
}
