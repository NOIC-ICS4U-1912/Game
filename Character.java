
/**
 * 在这里给出对类 MrX 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class Character 
{
    private Position pos;
    private ImageIcon img;
    private int length;
    private int speed;
    private boolean isAlive;
    private String dir;
    private String collide;
    private boolean isOnGround;
    private boolean isJumpDie;
    
    public Character(Position pos){
        this.pos = new Position(1,1);
        this.isAlive = true;
        this.dir = "right";
        this.isOnGround = true;
        this.collide = "no";
        this.isJumpDie = false;
        this.isAlive = true;
    }
    
    public Position getPos(){
        return this.pos;
    }
    
    public String getDir(){
        return this.dir;
    }
   
    public void setDir(String newDir){
        this.dir = newDir;
    }
    
    public void jump() throws InterruptedException{
        
        for(int i = 0 ; i < 50; i++){
            int xs = this.speed;
            int ys = -i*i + 100*i;
            if(this.collide.equals(this.dir)){
                xs = 0;
            }
            if(this.collide.equals("up")){
                break;
            }
            this.pos.setPos(this.pos.getX()+xs, this.pos.getY() + ys);
            Thread.sleep(10);
            this.onGround();
            if(this.isOnGround){
                break;
            }
        }
        int tempY = this.getPos().getY();
        while(true){
            
            int i = 0;
            this.onGround();
            if(this.isOnGround){
                break;
            }else{
                this.pos.setPos(this.pos.getX()+this.speed, this.pos.getY() - i*i);
                Thread.sleep(10);
            }
            if((tempY - this.getPos().getY()) >= 1000 ){
                isJumpDie = true;
            }
        }
    }
    
    public void run(){
        while(true){
            if(this.collide.equals(this.dir)){
                this.speed = 0;
            }else if(this.dir.equals("left")){
                this.speed = -5;
            }else if(this.dir.equals("right")){
                this.speed = 5;
            }
            this.pos.setPos(this.pos.getX()+speed, this.pos.getY());
            Thread.sleep(10);
        }
    }
    
    public void onGround(){
        if(this.getPos().getY() == 500){
            isOnGround = true;
        }
    }
    
    
    public boolean collide(String dir,ArrayList<Block> block){
        int x = this.pos.getX();
        int y = this.pos.getY();
        for(int i = 0; i < block.size(); i++){
            int w = block.get(i).getWidth();
            int l = block.get(i).getWidth();
            int xPos = block.get(i).getPosX();
            int yPos = block.get(i).getPosY();
            if((xPos < x+this.length)&&(xPos > x-w) &&(yPos < y+this.length)&&(yPos>y-l)){
                return true;
            }
        }
        return false;
    }
    
}
