/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foro;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gonza
 */
public class Foro1 extends JFrame{
    
    public Foro1(){
    
        super("Border Layaout");
        
        setSize(750, 500);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        
        JTextField txtnum = new JTextField();
        add(txtnum, BorderLayout.NORTH);
        
        JButton btnmul = new JButton("Mostrar");
        add(btnmul, BorderLayout.SOUTH);
        
        JTextArea txtarea = new JTextArea(70, 50);
        add(txtarea, BorderLayout.CENTER);
        
        btnmul.addActionListener(e -> {
        
            for (int i = 0; i < 10; i++) {
                
                String msg;
                
                msg = Integer.parseInt(txtnum.getText()) + " x " + (i + 1) +
                        " = " + (Integer.parseInt(txtnum.getText()) * (i+1)) + 
                        "\n";
                
                txtarea.append(msg);
                
            }
        
        });
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new Foro1();
        
    }
    
}
