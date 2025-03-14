public class TennisNew extends New{

    private String competition;
    private String player1;
    private String player2;


    public TennisNew(String headline , String competition , String player1 , String player2) {
        super(headline);
        this.competition = competition;
        this.player1 = player1;
        this.player2 = player2;
    }


    /*public String getCompetition() {
        return this.competition;
    }
    public String getPlayer1() {
        return this.player1;
    }
    public String getPlayer2() {
        return this.player2;
    }


    public void setCompetition(String competition) {
        this.competition = competition;
    }
    public void setPlayer1(String player1) {
        this.player1 = player1;
    }
    public void setPlayer2(String player2) {
        this.player2 = player2;
    }*/


    public String calculatePrice(String headline) {
        int finalPrice = 150;

        if (this.player1.equalsIgnoreCase("federer") || this.player1.equalsIgnoreCase("nadal")
                || this.player1.equalsIgnoreCase("djokovic")) {
            finalPrice += 100;
        } else if (this.player2.equalsIgnoreCase("federer") || this.player2.equalsIgnoreCase("nadal")
                || this.player2.equalsIgnoreCase("djokovic")){
        finalPrice += 100;
    }
        return "El preu de la noticia és de " + finalPrice + " €\n";
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
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }

}
