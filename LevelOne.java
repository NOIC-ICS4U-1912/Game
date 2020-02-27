package TheProject;

import java.util.ArrayList;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Component;
/**
* Write a description of class Map here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class LevelOne extends JFrame
{
    ArrayList<Block> blockOne = new ArrayList<Block>();
    
    
   
    public void LevelOneMap() { 
    
        for (int i = 0; i < blockOne.size();i++){
            blockOne.get(i).setLocation​(blockOne.get(i).getPosX(),blockOne.get(i).getPosY());
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


