package TheProject;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
/**
 * Write a description of class Position here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Charactor extends Thread
{
    private Position pos;
    private ImageIcon img;
    private int speed;
    private boolean isAlive;
    private String dir;
    private String collide;
    private boolean isOnGround;
    private boolean isJumpDie;
    
    public void Charactor(){
        this.pos = new Position();
        this.pos.setPos(1,1);
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
            this.pos.setPos(this.pos.getPosX()+xs, this.pos.getPosY() + ys);
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
    
    public String collide(String dir, ArrayList <Block> block){
        
        return this.collide;
    }
    
}
