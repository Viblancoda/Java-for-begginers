public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String word){
        int half = word.length() / 2;
        return word.substring(0, half);
    }
}