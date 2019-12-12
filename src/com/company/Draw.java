package com.company;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g; //everything we draw will be 2D

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //Antialiasing

        g.setColor(Color.BLACK); // Background
        g.fillRect(0,0,Var.screenwitdh,Var.screenheight); // fill background

        g.setColor(Color.white);
        g.fillRect(Var.x, Var.y, 150, 20);

        g.setFont(Var.pixelfont);
        g.drawString("" + Var.playerpoints, Var.screenwitdh/2 + 300, 50);


        //g.fillRect(Var.screenwitdh/2-350,30,10,10);
        for(int i=0;i<Var.playerlives;i++){
            g.fillRect(50 + i*20, 30, 10, 10);
        }

        g.fillRect(Var.Vx,Var.Vy,20,20);


        repaint();


    }


}
