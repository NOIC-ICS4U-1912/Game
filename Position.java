package TheProject;


/**
 * Write a description of class Position here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Position
{
    private int x;
    private int y;
    
    public void Position(int x ,int y){
        this.x = x;
        this.y = y;
        
    }
    
    
    public int getPosX(){
    
        return this.x;
    }
    
    public int getPosY(){
    
        return this.y;
    }
    
    public void setPos(int newX, int newY){
        
        this.x = newX;
        this.y = newY;
    }
    
    
}
