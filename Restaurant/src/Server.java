public class Server {


    public void println(String message)
    {
        System.out.println(message);
    }
    public static void print(String message)
    {
        System.out.print(message);
    }

    public void menu()
    {
        println("Welcome to the Java Cafe");
        println("Menu: ");
        println("Burger - $15");
        println("Pizza Slice - $12");
        println("Block of Parm Cheese - $80");
    }

    public void foodAndCheck(int burgerAmount, int pizzaAmount, int cheeseAmount)
    {
        for(int i = 1; i < burgerAmount + 1; i++)
        {
            System.out.println(" Here is Your Burger #" + i);
        }
        for(int i = 1; i < pizzaAmount + 1; i++)
        {
            System.out.println("Here is your pizzaSlice #" + i);
        }
        for(int i = 1; i < cheeseAmount + 1; i++)
        {
            System.out.println("Here is your Block of Parm Cheese #" +i);
        }


        int cheesePrice = 80;
        int burgerPrice = 15;
        int pizzaPrice = 12;
        int i = burgerAmount * burgerPrice;
        i += (pizzaAmount*pizzaPrice);
        i += (cheeseAmount * cheesePrice);
        System.out.println("Thank you for ording, you bill will be: ");
        System.out.print("$"+i);
    }
}
