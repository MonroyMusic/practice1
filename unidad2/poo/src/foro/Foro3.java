/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foro;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author gonza
 */
public class Foro3 extends JFrame{
    
    public Foro3(){
        
        super("Box Layout");
        
        setSize(750, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BoxLayout box = new 
        BoxLayout(getContentPane(), BoxLayout.X_AXIS);
        
        setLayout(box);
        
        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");
        
        add(btn1);
        add(btn2);
        add(btn3);
        
        setVisible(true);
        
    }
 
    public static void main(String[] args) {
        
        new Foro3();
        
    }
    
}
