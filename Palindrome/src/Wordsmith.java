class Wordsmith
{

/*big harry balls, githu test*/
    String clean(String message)
    {
        String filtered = "";
        for(int i = 0; i < message.length(); i++){
            char letter = message.charAt(i);
            int ascii = letter;

            if(((ascii >= 65) && (ascii <= 90)) || ((ascii >= 97) && (ascii <= 122))){
                filtered += letter;
            }
        }
        return filtered.toLowerCase();
    }
    boolean isPalindrome(String message)
    {
        if(message.length() < 2){
            return true;
        }
        else if(((message.charAt(0)) == (message.charAt(message.length() -1))))
        {
            return isPalindrome(message.substring(1, (message.length() -1)));
        }
        else
        {
            return false;
        }
    }
}