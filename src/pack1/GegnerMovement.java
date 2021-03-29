package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
    Timer move;

    public GegnerMovement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.ballx >= Var.screnheigth/2 -10){
                    if(Var.bally==Var.ggny){

                    } else if(Var.bally > Var.ggny +75){
                        if(Var.ggny <= Var.screnheigth-200){
                            Var.ggny+=1;
                        }

                    } else if(Var.ggny<Var.ggny+75){
                        if(Var.ggny >=20){
                            Var.ggny-=20;
                        }
                    }
                }

            } //end run()
        }, 0, 6);

    }
}
