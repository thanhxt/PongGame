package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Var {

    static JFrame jf1;
    static int screenwitdh = 800, screenheight = 800;

    static int x = 300, y = 700; //player position
    static boolean moveright = false, moveleft = false;
    static int Vx=200, Vy=200;

    static int playerpoints = 0, playerlives = 3;

    static Font pixelfont;

    public Var() {
        // setting the standard Font
        try {
            pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("Pixeled.ttf")).deriveFont(25f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Pixeled.ttf")));
        } catch(FontFormatException | IOException e){
            e.printStackTrace();
        }
    }
}
