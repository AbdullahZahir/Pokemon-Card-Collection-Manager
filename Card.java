public class Card
{
    private double value;
    private String name;
    private int setNum;
    private String condition;
    
    public Card (String cardName, String cardCondition, double cardValue, int cardSetNum)
    {
        name = cardName;
        condition = cardCondition;
        value = cardValue;
        setNum = cardSetNum;
    }

    public String getName()
    {
        return name;
    }
    
    public String getCondition()
    {
        return condition;
    }
    
    public double getValue()
    {
        return value;
    }
    
    public int getSetNum()
    {
        return setNum;
    }

    public String toString()
    {
        return name + " (" + condition + ") - $" + value + " - Set #" + setNum;
    }
}
