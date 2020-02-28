
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

/**
 * Write a description of class Image here.
 *
 * Leslie
 */
public class Image
{
    public static BufferedImage mrImage = null;
    public static BufferedImage beginImage = null;
    public static BufferedImage bgImage = null;
    public static BufferedImage bkImage = null;
    //public static BufferedImage fgImage = null;
    //lack beginning picture and end picture
    
    public static String imageLocation = System.getProperty("user.dir")+"/game/";
    
    public static void init() {
        //import images
        try {
            mrImage = ImageIO.read(new File(imageLocation + "mr.jpg"));
            bgImage = ImageIO.read(new File(imageLocation + "bg.jpg"));
            bkImage = ImageIO.read(new File(imageLocation + "bk.jpg"));
            beginImage = ImageIO.read(new File(imageLocation + "begin.png"));
            //fgImage = ImageIO.read(new File(imageLocation + "fg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
