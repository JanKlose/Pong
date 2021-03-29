package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
    Timer move;

    public BallMovement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Var.ballx += Var.ballDirx;
                Var.bally += Var.ballDiry;
            }
        },0,4);
    }

}
