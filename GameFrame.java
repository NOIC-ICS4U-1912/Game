
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 * Write a description of class GameFrame here.
 *
 * Leslie
 * 2.24
 */
public class GameFrame extends JFrame implements KeyListener {
    private boolean isStart = false;
    MrX mrX = new MrX();
    public static void main (String [] args) {
        new GameFrame();
    }
    
    public GameFrame() {
        this.setTitle("The Hardest Game in This Planet! ");
        this.setSize(1920,1080);
                
        this.addKeyListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Image.init();
        
        //this.MrX = new MrX();
        BufferedImage image = new BufferedImage(1920,1090,BufferedImage.TYPE_3BYTE_BGR);
        g.drawImage(image,0,0, this);
    }
    
    public void paint (Graphics g) {
        BufferedImage image = new BufferedImage();
    }
    
    /**
     * when press the keyboard
     */
    public void keyPressed (KeyEvent argO) {
        if (isStart) {
            if (key.getKeyCode() == 39) {
                this.mrX.rightMove();
            }
            if (key.getKeyCode() == 37) {
                this.mrX.leftMove();
            }
            if (key.getKeyCode() == 32) {
                this.mrX.jump();
            }
        }
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
