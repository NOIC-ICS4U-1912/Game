
import java.util.ArrayList;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Component;


private boolean isStart = false;
    public GameFrame gf;
    
    public KeyListener(GameFrame gf){
        this.gf = gf;
    }
    
    /**
     * when press the keyboard
     */
    public void keyPressed (KeyEvent key) {
        if (isStart) {
            if (key.getKeyCode() == 39) {
                gf.mrX.setDir("right");
                gf.mrX.run(true);
            }
            if (key.getKeyCode() == 37) {
                gf.mrX.setDir("left");
                gf.mrX.run(true);
            }
            if (key.getKeyCode() == 32) {
                gf.mrX.setDir("up");
                gf.mrX.jump();
            }
        }
    }
    
    /**
     * when release the keyboard
     */
    public void keyReleased(KeyEvent key) {
        if (isStart) {
            if (key.getKeyCode() == 39) {
                gf.mrX.setDir("right");
            }
            if (key.getKeyCode() == 37) {
                gf.mrX.setDir("right");
            }
            if (key.getKeyCode() == 32) {
                gf.mrX.setDir("right");
            }
            gf.mrX.run(false);
        }
    }lic class LevelOne extends JFrame
{
    ArrayList<Block> blockOne = new ArrayList<Block>();
    
    
   
    public void LevelOneMap() { 
    
        for (int i = 0; i < blockOne.size();i++){
            blockOne.get(i).setLocation(blockOne.get(i).getPosX(),blockOne.get(i).getPosY());
            blockOne.get(i).setSize (blockOne.get(i).getLength(),blockOne.get(i).getWidth());
            
            
        }
    }
    
    public void addBlock(Block newBlock){
    
        this.blockOne.add(newBlock);
    }
    
    public void main (){
    
        GameFrame theGame = new GameFrame();
        Charactor mrLee = new Charactor();
        
    }
}


