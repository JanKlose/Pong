package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//simple Method to handle Player movement.

public class KeyHandler implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveUp = true;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            Var.moveDown = true;
        }

    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveUp = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            Var.moveDown = false;
        }
    }
}
