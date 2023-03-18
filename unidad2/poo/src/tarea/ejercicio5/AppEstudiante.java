/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class AppEstudiante {
    
    public static void main(String[] args) {
        
        String name, career;
        
        int age, cal;
        
        Estudiante student = new Estudiante();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nombre del Estudiante: ");
        
        name = scan.nextLine();
        
        student.setName(name);
        
        System.out.print("Edad del Estudiante: ");
        
        age = scan.nextInt();
        
        student.setAge(age);
        
        scan.nextLine();
        
        System.out.print("Carrera que estudia el Estudiante: ");
        
        career = scan.nextLine();
        
        student.setCareer(career);
        
        System.out.print("Callificacion del Estudiante: ");
        
        cal = scan.nextInt();
        
        student.printData();
        
        student.aproveCourse(cal);
        
    }
    
}
