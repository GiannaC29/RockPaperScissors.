void main()
{
    Scanner in = new Scanner(System.in);
    String playA = "";
    String playB = "";
    boolean done = false;

    do
    {
        IO.print("Player A enter your RPS move [RPS/rps]: ");
        playA = in.nextLine();

        if(playA.matches("[RPSrps]"))
        {
            IO.println("Got player A move " + playA);
            done = true;
        }
        else //illegal move not rps
        {
            IO.println("You must enter [RPSrps] not " + playA);
        }
    }while (!done);

    done = false;
    do
    {
        IO.print("Player B enter your RPS move [RPS/rps]: ");
        playB = in.nextLine();

        if(playB.matches("[RPSrps]"))
        {
            IO.println("Got playerB move " + playB);
            done = true;
        }
        else //illegal move not rps
        {
            IO.println("You must enter [RPSrps] not " + playB);
        }
    }
    while (!done);

    if(playA.equals(playB) || //all possible tie with lower and upper
            (playA.equals("R") && playB.equals("r")) ||
            (playA.equals("r") && playB.equals("R")) ||
            (playA.equals("P") && playB.equals("p")) ||
            (playA.equals("p") && playB.equals("P")) ||
            (playA.equals("S") && playB.equals("s")) ||
            (playA.equals("s") && playB.equals("S")))
    {
        IO.println("It's a tie!");
    } //all possible r vs s with lower and upper
    else if((playA.equals("R") || playA.equals("r")) &&
            (playB.equals("S") || playB.equals("s")))
    {
        IO.println("Player A wins! Rock beats Scissors");
    } //all possible p vs s with lower and upper
    else if((playA.equals("S") || playA.equals("s")) &&
            (playB.equals("P") || playB.equals("p")))
    {
        IO.println("Player A wins! Scissors beats Paper");
    } //all possible p vs r with lower and upper
    else if((playA.equals("P") || playA.equals("p")) &&
            (playB.equals("R") || playB.equals("r")))
    {
        IO.println("Player A wins! Paper beats Rock");
    }
    else
    {
        IO.println("Player B wins!");
    }
}
