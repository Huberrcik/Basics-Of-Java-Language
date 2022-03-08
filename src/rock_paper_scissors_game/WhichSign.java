package rock_paper_scissors_game;

public class WhichSign {
    public String checkSign(int sign){
        String iKnowWhatSignIsIt;
        switch (sign) {
            case 1:
                iKnowWhatSignIsIt = "rock";
                break;
            case 2:
                iKnowWhatSignIsIt = "paper";
                break;
            case 3:
                iKnowWhatSignIsIt = "scissors";
                break;
            default:
                iKnowWhatSignIsIt = "Sth wrong, sign variable = " + sign;
        }
        return iKnowWhatSignIsIt;
    }
}
