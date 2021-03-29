package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
    Timer kollision;

    public BallKollision(){
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Kollision unten
                if(Var.bally+50>= Var.screnheigth){
                    Var.ballDiry = -1;
                }
                // oben
                if(Var.bally <= 0){
                    Var.ballDiry = 1;
                }
                // rechts
                if (Var.ballx +20 >= Var.screenwidth){
                    Var.ballx = Var.screenwidth/2 -10;
                    Var.bally = Var.screnheigth/2 -10;

                    Var.ballDirx = -1;
                    Var.playerPoints++;
                }
                // links
                if (Var.ballx <= 0){
                    Var.ballx = Var.screenwidth/2 - 10;
                    Var.bally = Var.screnheigth/2 -10;

                    Var.ballDirx = 1;
                    Var.ggnPoints++;
                }
                //HitBox Player
                if(Var.ballx < Var.x+25 && Var.ballx > Var.x && Var.bally-20 < Var.y+150 && Var.bally> Var.y){
                    Var.ballDirx = 1;
                }
                //HitBox Gegner
                if(Var.ballx < Var.ggnx && Var.ballx > Var.ggnx -25 && Var.bally-20 < Var.ggny+150 && Var.bally> Var.ggny){
                    Var.ballDirx = -1;
                }


            }
        }, 0, 4);

    }

}
