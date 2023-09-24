public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    //Instance methods//
   /* Complete the method makeItACombo */
    public void makeItACombo(){
        name = name + " with fries and soda";
        cost += 3;
    }

   /* Complete the method getBill */
    public String getBill(){
        return name + ", $" + cost;
    }
}