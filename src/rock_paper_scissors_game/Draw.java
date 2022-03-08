package rock_paper_scissors_game;

public class Draw {
    public int getRandomNumber() {
        final int min = 1;
        final int max = 4;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
