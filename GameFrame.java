package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * Write a description of class GameFrame here.
 *
 * Leslie
 * 2.24
 */
public class GameFrame extends JFrame implements KeyListener {
    public static void main (String [] args) {
        new GameFrame();
    }
    
    public GameFrame() {
        this.setTitle("The Hardest Game in This Planet! ");
        this.setSize(1920,1080);
                
        this.addKeyListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    /**
     * when press the keyboard
     */
    public void keyPressed (KeyEvent argO) {
        
    }
    
    /**
     * when release the keyboard
     */
    public void keyReleased(KeyEvent argO) {
    }
    
    /**
     * when input sth the keyboard
     */
    public void keyTyped(KeyEvent argO) {
    }
    
    
}
