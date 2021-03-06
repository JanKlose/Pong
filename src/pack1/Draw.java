package pack1;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.fillRect(0,0, Var.screenwidth, Var.screnheigth);

        g.setColor(Color.WHITE);

        for(int i = 0; i <= 30; i++){
            g.fillRect(Var.screenwidth/2 -5, i*20, 10, 10);

        }
        //Player and Enemy bar
        g.fillRect(Var.x, Var.y, 25, 150); 
        g.fillRect(Var.ggnx, Var.ggny, 25, 150); 

        //counting the score
        g.drawString(""+ Var.playerPoints, Var.screenwidth/2-95, 75);
        g.drawString(""+ Var.ggnPoints, Var.screenwidth/2+50, 75);

        g.fillRect(Var.ballx, Var.bally, 20, 20);

        repaint(); // to visualize movement

        }

}
