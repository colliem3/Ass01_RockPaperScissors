import java.util.Scanner;

public class RPS
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "";
        Boolean playerAValid;
        Boolean playerBValid;
        Boolean quitGame = true;

        do {
            System.out.println("Player A input your move (R, P, S)");
            do {
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    playerAValid = true;
                } else {
                    playerAValid = false;
                    System.out.println("Not a valid input. enter one of the following options (R, P, S)");
                }
            }
            while (playerAValid == false);

            System.out.println("Player B input your move (R, P, S)");
            do {
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    playerBValid = true;
                } else {
                    playerBValid = false;
                    System.out.println("Not a valid input. enter one of the following options (R, P, S)");
                }
            }
            while (playerBValid == false);


            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock its a TIE");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors Player A wins");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock Player A wins");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else {
                    System.out.println("Scissors cuts Paper Player B wins!");
                }
            } else
            {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts papers Player A wins");
                } else {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }
            }
            System.out.println("Do you want to play again? [Y/N]");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {
                quitGame = false;
            } else if (playAgain.equalsIgnoreCase("N")) {
                quitGame = true;
                System.out.println("Game End");
            }
        } while (!quitGame);
    }
}