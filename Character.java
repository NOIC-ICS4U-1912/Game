import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

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
            this.pos.setPos(this.pos.getPosX()+xs, this.pos.getPosY() + ys);
            Thread.sleep(10);
            this.onGround();
            if(this.isOnGround){
                break;
            }
        }
        int tempY = this.getPos().getPosY();
        while(true){
            
            int i = 0;
            this.onGround();
            if(this.isOnGround){
                break;
            }else{
                this.pos.setPos(this.pos.getPosX()+this.speed, this.pos.getPosY() - i*i);
                Thread.sleep(10);
            }
            if((tempY - this.getPos().getPosY()) >= 1000 ){
                isJumpDie = true;
            }
        }
    }
    
    public void run() throws InterruptedException {
        while(true){
            if(this.collide.equals(this.dir)){
                this.speed = 0;
            }else if(this.dir.equals("left")){
                this.speed = -5;
            }else if(this.dir.equals("right")){
                this.speed = 5;
            }
            this.pos.setPos(this.pos.getPosX()+speed, this.pos.getPosY());
            Thread.sleep(10);
        }
    }
    
    public void onGround(){
        if(this.getPos().getPosY() == 500){
            isOnGround = true;
        }
    }
    
    
    public boolean collide(String dir,ArrayList<Block> block){
        int x = this.pos.getPosX();
        int y = this.pos.getPosY();
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
