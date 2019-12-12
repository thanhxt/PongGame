package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
Timer move;
    public Movement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {

                if(Var.moveleft==true){
                    if(Var.x >= 20 ){
                        Var.x -= 2;
                    }
                } else if(Var.moveright==true){
                        if(Var.x<= Var.screenwitdh-200){
                            Var.x += 2;
                        }
                    }
                }
        },0,6);
    }
}
