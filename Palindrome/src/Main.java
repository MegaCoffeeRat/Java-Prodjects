//Coded in IDE, copied to replit


import java.util.Scanner;

class Main
{
    public static final String WHITE = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);

        Wordsmith ws = new Wordsmith();

        String word = "";

        System.out.println(GREEN + "Hello, welcome to the Palindrome Program.");
        word = word.toLowerCase();
        while(!word.equals("q")){
            System.out.println(WHITE + "\nPlease enter a message " +  " (q to quit) ");
            word = Scan.nextLine();

            word = ws.clean(word);

            if(!word.equals("q"))
            {
                if(ws.isPalindrome(word))
                {
                    System.out.println(GREEN + "\nThe message " + word +  " IS a palindrome!");
                }
                else if(!ws.isPalindrome(word))
                {
                    System.out.println(RED + "\nThe message " + word +  " IS NOT a palindrome!");
                }
            }
        }
        System.out.println(WHITE + "\nGoodbye.");
        Scan.close();
    }
}