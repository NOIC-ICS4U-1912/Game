package game;

import java.awt.image.BufferedImage;
import java. util.ArrayList;

/**
 * Write a description of class Map here.
 *
 * Leslie
 */
public class Map extends StaticValue
{
    private BufferedImage bcImage = null;
    private int sort;
    private boolean flag;
    ArrayList block = new ArrayList();
    
    public Map(int sort, boolean flag) {
        this.sort = sort;
        this.flag = flag;
        //! need beginning and end picture
        if (flag) {
            bgImage = StaticValue.bgImage;
        }else {
            bgImage = StaticValue.bgImage;
        }
    }
    public void reset() { 
    }
}
