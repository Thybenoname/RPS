class RPS {
    public static void main(String args[])
    {
        System.out.println(Config.printRules());
        Player player1 = new Player();
        player1.setPcChoice();
        player1.setNpcChoice();
        System.out.println(Config.printOutcome(
            Config.calculateWinner(player1.getpcChoice(), player1.getnpcChoice())));
    }
}
