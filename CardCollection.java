import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CardCollection
{
    private ArrayList<Card> collection;

    // Constructor that creates a blank collection
    public CardCollection()
    {
        collection = new ArrayList<Card>();
    }

    // Returns the total value of all cards in the collection
    public double getTotalValue()
    {
        double total = 0;
        
        for (Card card: collection) {
            total += card.getValue();
        }
        
        return total;
        
        
    }

    // Prints the names of all cards in "Perfect" condition
    public void printPerfect()
    {
        System.out.println("Cards in perfect condition:");
        for (Card card: collection) {
            if (card.getCondition().equals("Perfect")) {
                System.out.println(card.getName());
            }
        }
        
        
        System.out.println();
    }

    // Loads cards into collection from text file. Text file
    // must only have commas between fields (no spaces)
    public void loadCardsFromFile(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner input = new Scanner(file);

            while (input.hasNext())
            {
                // Grab the whole line
                String line = input.nextLine();
                // Split the line into an array, as separated by the commas
                String[] parts = line.split(",");

                // Ensuring correct data format (will skip card if missing data)
                if (parts.length == 4)
                {
                    String name = parts[0];
                    String condition = parts[1];

                    // Use wrapper class methods to convert Strings to numbers
                    double value = Double.parseDouble(parts[2]);
                    int setNum = Integer.parseInt(parts[3]);

                    // Create new card with inputted values
                    Card newCard = new Card(name, condition, value, setNum);
                    // Add card to the collection ArrayList
                    collection.add(newCard);
                }
            }

            input.close();
            System.out.println("Cards loaded successfully!\n");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Displays all cards
    public void displayCollection()
    {
        System.out.println("=== Card Collection ===");
        for (Card card : collection)
        {
            System.out.println(card);
        }
        System.out.println();
    }
}
