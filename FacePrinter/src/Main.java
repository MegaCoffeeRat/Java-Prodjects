/*
Alex Fedorenko
1A
Faceprinter 
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        FacePrinter facePrinter = new FacePrinter();
        String hair = "";
        String eyes = "";
        String nose = "";
        String mouth = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Pick a type of hair: (Curly, Straight, Wavy): ");
        hair = scan.nextLine();

        System.out.print("Pick a type of Eyes: (Circle, Starry, Anime): ");
        eyes = scan.nextLine();

        System.out.print("Pick a type of nose: (Pointy, Square, Piggy): " );
        nose = scan.nextLine();

        System.out.print("Pick a type of mouth: (Smile, Plain, Fangs): ");
        mouth = scan.nextLine();

        facePrinter.printFace(hair.toLowerCase(), eyes.toLowerCase(), nose.toLowerCase(), mouth.toLowerCase());
        scan.close();
    }
}