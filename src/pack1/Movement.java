package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
    Timer move;
    public Movement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(Var.moveUp == true){
                    if(Var.y >= 20){
                        Var.y -=2;

                    }
                } else if(Var.moveDown == true){
                    if(Var.y <= Var.screnheigth-200){
                        Var.y += 2;
                    }
                }

            } //end run()
        }, 0, 6);

    }
}
