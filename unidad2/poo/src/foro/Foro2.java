/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foro;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author gonza
 */
public class Foro2 extends JFrame{
    
    JButton[] btnnum = new JButton[15];
    
    public Foro2(){
        
        super("Grid Layout");
        
        setSize(750, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3, 3));
        
        for (int i = 0; i < 15; i++) {
            
            btnnum[i] = new JButton("Boton " + (i+1));
            add(btnnum[i]);
            
        }
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Foro2();
        
    }
    
}
