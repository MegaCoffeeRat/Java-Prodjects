class Storyteller
{
    WordGenerator words = new WordGenerator();

    String Actor = words.Actor();
    String Action = words.Action();
    String Danger = words.Danger();
    String Adj = words.Adjective();
    String Emotion = words.Emotion();

    public void tellStory()
    {

        System.out.println(Actor + " " + Action + " " + "from the " + Adj + " " + Danger + " that made him " + Emotion);

    }

    public void StoryOne()
    {
        System.out.println(Danger + " " + " turned  " + Actor + " into a  " + Adj + " rat, " + " now " + Actor + " is " + Emotion);

    }


    public void StoryTwo()
    {
        System.out.println(Danger + " turned " + Actor + " into a " + Adj + " racoon, and now " + Actor + " is feeling big " + Emotion);
    }


    public void StoryThree()
    {
        System.out.println("Once upon a time, a " + Actor + " embarked on a(n) " + Adj + " journey and then " + Action + " Little did they know, " + Danger +" lurked around every corner. As the " + Actor +" faced " + Danger+" head-on, their heart raced with " + Emotion + ".");
    }


    public void StoryFour()
    {
        System.out.println("In a land far, far away, a brave " + Actor + " set out on a " + Adj + " quest to " + Action + ". As they ventured deeper into the enchanted forest, the looming " + Danger + " filled the air with tension. With courage in their heart, the " + Actor + " confronted the " + Danger + " and felt " + Emotion + ".");
    }




}