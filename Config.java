public class Config {
    private static final String[] CHOICES = {"ROCK", "PAPER", "SCISSORS"};
    private static final String[] OUTCOMES = {"\nTie", "\nYou Win", "\nYou Lose"};

    public static String printRules()
    {
        return "\nWelcome to RPS:\n\nRock beats Scissors,\nScissors beats Paper,\nand Paper "
            + "beats Rock:\n";
    }

    public static int calculateWinner(int pcChoice, int npcChoice)
    {
        if (pcChoice == 0 && npcChoice == 1 || pcChoice == 1 && npcChoice == 2 ||
            pcChoice == 2 && npcChoice == 0)
        {
            return 2;
        }
        else if (pcChoice == npcChoice)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static String printOutcome(int winner)
    {
        return OUTCOMES[winner];
    }
}
