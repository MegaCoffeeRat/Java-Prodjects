package core;
import org.newdawn.slick.Image;


public class Images {

    public static Image Fries;

    public static void loadImages()
    {
        try
        {
            Fries = new Image("res/fries.png");
        }
        catch(Exception e)
        {
            System.out.println("Exception | Image Fries");
        }
    }

}
