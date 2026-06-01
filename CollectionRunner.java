public class CollectionRunner 
{
    public static void main(String[] args) 
    {
        CardCollection collection = new CardCollection();
        collection.loadCardsFromFile("cards_collected.txt");
        collection.displayCollection();
        collection.printPerfect();
        System.out.println("Total value: $" + collection.getTotalValue());
        
        
        
        
    }
}
