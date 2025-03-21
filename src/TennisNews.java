public class TennisNews extends News {

    private String competition;
    private String player1;
    private String player2;


    public TennisNews(String headline , String competition , String player1 , String player2) {
        super(headline);
        this.competition = competition;
        this.player1 = player1;
        this.player2 = player2;
    }


    public String calculatePrice(String headline) {
        int finalPrice = 150;

        if (this.player1.equalsIgnoreCase("federer") || this.player1.equalsIgnoreCase("nadal")
                || this.player1.equalsIgnoreCase("djokovic")) {
            finalPrice += 100;
        } else if (this.player2.equalsIgnoreCase("federer") || this.player2.equalsIgnoreCase("nadal")
                || this.player2.equalsIgnoreCase("djokovic")){
        finalPrice += 100;
    }
        return "News price is " + finalPrice + " €\n";
    }
    public String calculateScore(String headline) {
        int finalPunctuation = 4;

        if (this.player1.equalsIgnoreCase("federer") || this.player1.equalsIgnoreCase("nadal")
                || this.player1.equalsIgnoreCase("djokovic")) {
            finalPunctuation += 3;
        } else if (this.player2.equalsIgnoreCase("federer") || this.player2.equalsIgnoreCase("nadal")
                || this.player2.equalsIgnoreCase("djokovic")){
            finalPunctuation += 3;
        }
        return "News score is " + finalPunctuation + "\n";
    }

}
