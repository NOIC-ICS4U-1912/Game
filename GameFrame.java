
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.List;

/**
 * Write a description of class GameFrame here.
 *
 * Leslie
 * 2.24
 */
public class GameFrame extends JFrame  {
    private boolean isStart = false;
    Position charaPos = new Position(100,500);
    Character mrX = new Character(charaPos);
    private Map nowBG = null;
    
    public static void main (String [] args) {
        new GameFrame();
    }
    
    public GameFrame() {
        this.setTitle("The Hardest Game in This Planet! ");
        this.setSize(1920,1080);
      
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Image.init();
        
        this.mrX.getPos().setPos(0,480);
    }
    
    public void paint() {
        BufferedImage image = new BufferedImage(900, 600, BufferedImage.TYPE_3BYTE_BGR);
        Graphics g2 = image.getGraphics();
        
        if(isStart) {
            g2.drawImage(Image.bgImage,0,0,this);
        }
    }
}
