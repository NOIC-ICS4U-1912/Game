
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

import java.util.ArrayList;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Component;


public class GameFrame extends JFrame
{
    private Character mrX;
    private KeyListener levelOne;
    private ArrayList<Block> blockOne = new ArrayList<Block>();
    
    
   
    public void mapConstructuer() { 
        this.setTitle("The Hardest Game in This Planet! ");
        this.setSize(1920,1080);
        
        
        for (int i = 0; i < blockOne.size();i++){
            blockOne.get(i).setLocation​(blockOne.get(i).getPosX(),blockOne.get(i).getPosY());
            blockOne.get(i).setSize (blockOne.get(i).getLength(),blockOne.get(i).getWidth());
        }
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void addBlock(Block newBlock){
        
        this.blockOne.add(newBlock);
    }
    
    public void main (){
        
        BufferedImage image = new BufferedImage(1920,1090,BufferedImage.TYPE_3BYTE_BGR);
        g.drawImage(image,0,0, this);
        GameFrame theGame = new GameFrame();
        this.mrX = new Character(new Position(1,1));
        this.KeyListener =  new KeyListener(this);
        
    }
    
    
}
