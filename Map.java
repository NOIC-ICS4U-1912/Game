 
import java.awt.image.BufferedImage;
import java. util.ArrayList;

/**
 * Write a description of class Map here.
 *
 * Leslie
 */
public class Map extends Image
{
    private BufferedImage bcImage = null;
    private int sort;
    private boolean flag;
    ArrayList block = new ArrayList();
    
    public Map() {
        this.sort = sort;
        this.flag = flag;
        //! need beginning and end picture
        if (flag) {
            bgImage = Image.beginImage;
        }else {
            bgImage = Image.bgImage;
        }
        
        this.block.add(new Block());
    }
    public void reset() { 
    }
}
