package com.company;

import javax.swing.*;

public class GUI {

    /**
     * Constructor that creates the Frame
     */
    public GUI(){
        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwitdh,Var.screenheight);
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jf1.setLayout(null);
        Var.jf1.setResizable(false);
        Var.jf1.setVisible(true);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.addKeyListener(new KeyMovement());
        Var.jf1.requestFocus();


        Draw lbldraw = new Draw();
        lbldraw.setBounds(0, 0, Var.screenwitdh, Var.screenheight); // draws the Frame
        lbldraw.setVisible(true); // to see the frame
        Var.jf1.add(lbldraw);
    }
}
