
/**
 * 在这里给出对类 Position 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.awt.*;
import javax.swing.*;

public class Position
{
    private int x;
    private int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setPos(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    
}
