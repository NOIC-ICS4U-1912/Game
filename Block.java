 
import java.awt.image.BufferedImage;

/**
 * Write a description of class Block here.
 *
 * Dave
 */
public class Block extends Map
{
    private Position blockPos;
    private int length;
    private int width;
    private BufferedImage img;
    
    public void Block(Position newBlockPos,int newLength,int newWidth){
        img = Image.bkImage;
        this.blockPos = newBlockPos;
        this.length = newLength;
        this.width = newWidth;
    }
    
    
    
    /*public int getPosX(){
    
        return this.blockPos.getX();
    }
    
    public int getPosY(){
    
        return this.blockPos.getY();
    }*/
    
    public int getLength(){
    
        return this.length;
    }
    
    public int getWidth(){
    
        return this.width;
    }
    
    
    
    public void setPos(int newX, int newY){
        
        this.blockPos.setPos(newX,newY);
    }
   
    public void delateBlock(){
    
        this.blockPos = null;
        this.length = 0;
        this.width = 0;
        
    }
    
    public BufferedImage getImage() {
        return this.img;
    }
}
