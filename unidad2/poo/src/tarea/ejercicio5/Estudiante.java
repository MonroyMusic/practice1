/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio5;

/**
 *
 * @author gonza
 */
public class Estudiante {
    
    private String name;
    private int age;
    private String career;
    private double prom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
    
    public void aproveCourse(double calificacion){
        
        prom = calificacion / 100;
        
        System.out.println("Promedio: " + prom);
        
        if(prom >= 0.65){
            
            System.out.println("El estudiante aprobó");
            
        }else{
            
            System.out.println("El estudiante reprobó");
            
        }
        
    }
    
    
    public void printData(){
        
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Carrera: " + career);
        
    }
    
}
