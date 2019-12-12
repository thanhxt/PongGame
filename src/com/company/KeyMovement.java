package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMovement implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            Var.moveleft = true;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            Var.moveleft = false;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            Var.moveright = false;
        }
    }
}
