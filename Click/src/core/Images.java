package core;
import org.newdawn.slick.Image;


public class Images {

    public static Image Fries;
    public static Image bg;
    public static Image scaledbg;
    public static Image arnold;
    public static Image weight;

    public static void loadImages()
    {
        try
        {
            Fries = new Image("res/fries.png");
            bg = new Image("res/bg.png");
            scaledbg = bg.getScaledCopy(Main.getScreenWidth(), Main.getScreenHeight());
            arnold = new Image("res/Arnold.png");
            weight = new Image("res/weight.png");
        }
        catch(Exception e)
        {
            System.out.println("Exception | Images");
        }
    }

}
