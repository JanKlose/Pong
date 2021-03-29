package pack1;

import javax.swing.*;

public class GUI {

    public GUI(){

        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwidth, Var.screnheigth);
        Var.jf1.setTitle("PONG!");
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jf1.setLayout(null);
        Var.jf1.setResizable(false);
        Var.jf1.setVisible(true);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.requestFocus();

        Draw labelDraw = new Draw();
        labelDraw.setBounds(0,0, Var.screenwidth, Var.screnheigth);
        labelDraw.setVisible(true);
        Var.jf1.add(labelDraw);

    }

}
