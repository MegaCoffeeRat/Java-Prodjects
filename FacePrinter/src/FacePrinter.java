public class FacePrinter {
    public void printFace(String hair, String eyes, String nose, String mouth) {
        printHair(hair);
        printEyes(eyes);
        printNose(nose);
        printMouth(mouth);
    }


    public void printHair(String type)
    {
        if(type.equals("curly"))
        {
            System.out.println("()()()()()()");
        }
        else if(type.equals("straight"))
        {
            System.out.println("||||||||||||");
        }
        else if(type.equals("wavy"))
        {
            System.out.println("WWWWWWWWWWWW");
        }

        else
        {
            System.out.println("Sorry I didnt understand your hair for Hair");
        }
    }
    public void printEyes(String type)
    {
        if(type.equals("circle"))
        {
            System.out.println("  o      o  ");
        }
        else if(type.equals("starry"))
        {
            System.out.println("  *      *  ");
        }
        else if(type.equals("anime"))
        {
            System.out.println("  ^      ^  ");
        }
        else
        {
            System.out.println("Sorry I didnt understand you input for eyes");
        }
    }
    public void printNose(String type)
    {
        if(type.equals("pointy"))
        {
            System.out.println("     <     ");
        }
        else if(type.equals("square"))
        {
            System.out.println("      []      ");
        }

        else if(type.equals("piggy"))
        {
            System.out.println("    @@     ");
        }
        else
        {
            System.out.println("Sorry I didnt understand your Input for nose");

        }
    }
    public void printMouth(String type)
    {
        if(type.equals("smile"))
        {
            System.out.println("[_________]");
        }
        else if(type.equals("plain"))
        {
            System.out.println("----------");
        }
        else if(type.equals("fangs"))
        {
            System.out.println("\\/\\/\\/\\/\\/");

        }

        else
        {
            System.out.println("Sorry I didnt understand your Input for mouth");
        }
    }
}
