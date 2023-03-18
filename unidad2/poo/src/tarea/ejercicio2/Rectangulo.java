package tarea.ejercicio2;

public class Rectangulo{
    
    public int base;
    public int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int altura) {
        this.height = altura;
    }

    public int calcularArea(){
        
        int basea, heighta;
        
        basea = this.getBase();
        
        heighta = this.getHeight();
        
        return basea * heighta;
        
    }
    
}
