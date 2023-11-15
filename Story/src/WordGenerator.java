import java.lang.Math;
class WordGenerator
{

    public String Actor()
    {
        int num = ((int) (Math.random() * 5));
        if(num == 1)
        {
            return "Pepe the Frog";
        }
        else if(num == 2)
        {
            return "Tim Cook";
        }
        else if(num == 3)
        {
            return "Steve Jobs";

        }
        else if(num == 4)
        {
            return "PewDiePie ";
        }
        else
        {
            return "Bill Gates";
        }

    }

    public String Action()
    {
        int num = ((int) (Math.random() * 5));
        if(num == 1)
        {
            return "ran";
        }
        else if(num == 2)
        {
            return "flew away";
        }
        else if(num == 3)
        {
            return "went invisible";

        }
        else if(num == 4)
        {
            return "sprinted away";
        }
        else
        {
            return "walked";
        }
    }

    public String Emotion()
    {
        int num = ((int) (Math.random() * 5));
        if(num == 1)
        {
            return "happy";
        }
        else if(num == 2)
        {
            return "sad";
        }
        else if(num == 3)
        {
            return "scared";

        }
        else if(num == 4)
        {
            return "laugh out loud";
        }
        else
        {
            return "die inside";
        }
    }

    public String Adjective()
    {
        int num = ((int) (Math.random() * 5));
        if(num == 1)
        {
            return "green";
        }
        else if(num == 2)
        {
            return "scary";
        }
        else if(num == 3)
        {
            return "dangerous";

        }
        else if(num == 4)
        {
            return "joyful";
        }
        else
        {
            return "sadness";
        }
    }

    public String Danger()
    {
        int num = ((int) (Math.random() * 5));
        if(num == 1)
        {
            return "electrical fire";
        }
        else if(num == 2)
        {
            return "asbestos";
        }
        else if(num == 3)
        {
            return "bugs in his code";

        }
        else if(num == 4)
        {
            return "70mph 16 ton truck";
        }
        else
        {
            return "school teacher";
        }
    }
}