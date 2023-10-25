public class Main
{
    static int LIST_SIZE = 7;

    public static void main(String[] args)
    {
        Input userInterface = new Input();
        userInterface.readFile();
        userInterface.menu();
    }
}
