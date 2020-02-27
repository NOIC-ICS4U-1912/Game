
/**
 * 在这里给出对类 MrX 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class MrX 
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
    
    public MrX(Position pos){
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
        for(int i = 0 ; i < 150; i++){
            int xs = this.speed;
            int ys = -i*i + 150*i;
            if(this.collide.equals(this.dir)){
                xs = 0;
            }
            if(this.collide.equals("up")){
                i = 150 - i;
                ys = -i*i + 150*i;
            }
            this.pos.setPos(this.pos.getX()+xs, this.pos.getY() + ys);
            Thread.sleep(10);
            if(this.isOnGround){
                break;
            }
        }
    }
    
    public void run(){
        while(true){
            if(this.collide.equals(this.dir)){
                this.speed = 0;
            }else{
                this.speed = 5;
            }
        }
    }
    
    public void onGround(){}
    
    public void jumpDie(){}
    
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
