//coded from an ide, then coppied to replit
//Alex Fedorenko, 1A
//Restaurant
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Server server = new Server();
        Scanner scan = new Scanner(System.in);
        int pizzaAmount;
        int burgerAmount;
        int cheeseAmount;

        server.menu();

        print("How many Burgers Would You Like?: ");
        burgerAmount = scan.nextInt();
        print("How many slices of pizza would you like?: ");
        pizzaAmount = scan.nextInt();
        print("How many Blocks of Parm Chese would you like?: ");
        cheeseAmount = scan.nextInt();

        server.foodAndCheck(burgerAmount, pizzaAmount, cheeseAmount);
    }
    public void println(String message)
    {
        System.out.println(message);
    }
    public static void print(String message)
    {
        System.out.print(message);
    }

}
