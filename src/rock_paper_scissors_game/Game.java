package rock_paper_scissors_game;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int counterUserWins;
    int counterComputerWins;

    Game(){
        System.out.println("Hello, let's play game rock, paper, scissors, till 3 wins!");
        System.out.println("Pick your sign and we can start: ");
        System.out.println("1 - rock");
        System.out.println("2 - paper");
        System.out.println("3 - scissors");
        letsPlay();
    }
    Draw draw1 = new Draw();
    WhichSign whatSign = new WhichSign();

    void userWin(int pick, int computerPick){
        System.out.println("Your sign = " + whatSign.checkSign(pick));
        System.out.println("My sign = " + whatSign.checkSign(computerPick));
        System.out.println(whatSign.checkSign(pick) + " beats " + whatSign.checkSign(computerPick) + ", point for you :(");
        counterUserWins++;
        System.out.println("Your points: " + counterUserWins);
        System.out.println("My points " + counterComputerWins);
    }
    void computerWin(int pick, int computerPick){
        System.out.println("Your sign = " + whatSign.checkSign(pick));
        System.out.println("My sign = " + whatSign.checkSign(computerPick));
        System.out.println( whatSign.checkSign(computerPick) + " beats " + whatSign.checkSign(pick) + ", point for me! :)");
        counterComputerWins++;
        System.out.println("Your points: " + counterUserWins);
        System.out.println("My points " + counterComputerWins);
    }

    public void letsPlay(){
        while(true) {

            int computerPick = draw1.getRandomNumber();
            String pick1 = sc.next();
            int pick = 0;
            int r=0;
            while(r != 1) {
                try {
                    pick= Integer.parseInt(pick1);
                    r = 1;
                } catch (Exception e) {
                    System.out.println("Bad number, try again: ");
                    pick1 = sc.next();
                }
            }
            while (pick == computerPick) {
                computerPick = draw1.getRandomNumber();
                System.out.println("We picked the same - " + whatSign.checkSign(pick));
                System.out.println("Pick again: ");
                String pick2 = sc.next();
                int s=0;

                while(s != 1) {

                    try {
                        pick= Integer.parseInt(pick1);
                        s = 1;
                    } catch (Exception e) {
                        System.out.println("Bad number, try again: ");
                        pick1 = sc.next();
                    }
                }
            }
            if (pick == 1 && computerPick == 2) {
                computerWin(pick, computerPick);
            } else if (pick == 2 && computerPick == 1) {
                userWin(pick, computerPick);
            } else if (pick == 1 && computerPick == 3) {
                userWin(pick, computerPick);
            } else if (pick == 3 && computerPick == 1) {
                computerWin(pick, computerPick);
            } else if (pick == 2 && computerPick == 3) {
                computerWin(pick, computerPick);
            } else if (pick == 3 && computerPick == 2) {
                userWin(pick, computerPick);
            }
            if(counterUserWins >= 3){
                System.out.println("You won :(");
                System.exit(0 );
            }

            if(counterComputerWins >=3){
                System.out.println("I won ! :)");
                System.exit(0);
            }

        }
    }
}
