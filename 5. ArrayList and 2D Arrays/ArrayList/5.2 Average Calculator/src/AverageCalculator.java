import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double average;
        int total = 0;
        for (int num: numbers){
            total += num;
        }
        average = total / numbers.size();
        return average;
    }
}