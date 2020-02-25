package TheProject;


/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Block extends Map
{
    private Position blockPos;
    private int length;
    private int width;
    
    public void Block(Position newBlockPos,int newLength,int newWidth){
    
        this.blockPos = newBlockPos;
        this.length = newLength;
        this.width = newWidth;
    }
    
    
    
    public int getPosX(){
    
        return this.blockPos.getPosX();
    }
    
    public int getPosY(){
    
        return this.blockPos.getPosY();
    }
    
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
}
