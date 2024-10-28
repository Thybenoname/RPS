import java.util.Random;
import java.util.Scanner;

public class Player {
    // creates the choice

    private String choice;
    // creates and gets the cpu's choice

    private int npcChoice;
    public int getnpcChoice()
    {
        this.npcChoice = npcChoice;
        return this.npcChoice;
    }
    // creates and gets the players choice

    private int pcChoice;
    public int getpcChoice()
    {
        this.pcChoice = pcChoice;
        return this.pcChoice;
    }
    // gets the choice

    public String getChoice()
    {
        this.choice = choice;
        return this.choice;
    }
    // gets the players choice

    public int setPcChoice()
    {
        System.out.print("So,\n\nMake your move: ");
        Scanner askChoice = new Scanner(System.in);
        String upperChoice = askChoice.nextLine();
        this.choice = upperChoice;
        this.choice = this.choice.toUpperCase();
        choiceDecider();
        askChoice.close();
        return 0;
    }
    // turns that choice into a number

    public void choiceDecider()
    {
        if (this.choice.equals("ROCK"))
        {
            this.pcChoice = 0;
        }
        else if (this.choice.equals("PAPER"))
        {
            this.pcChoice = 1;
        }
        else if (this.choice.equals("SCISSORS"))
        {
            this.pcChoice = 2;
        }
        else
        {
            System.out.println("Thats not a choice\n");
            setPcChoice();
        }

    }
    // gets a random number and sets it a choice

    public void setNpcChoice()
    {
        this.npcChoice = (int)(Math.random()*3);
        if (this.npcChoice == 0)
        {
            System.out.println("\nI choose rock");
        }
        if (this.npcChoice == 1)
        {
            System.out.println("\nI choose paper");
        }
        if (this.npcChoice == 2)
        {
            System.out.println("\nI choose scissors");
        }
    }
}
