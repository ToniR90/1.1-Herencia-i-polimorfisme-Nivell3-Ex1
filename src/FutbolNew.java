public class FutbolNew extends New{

    private String competition;
    private String club;
    private String player;


    public FutbolNew(String headline , String competition , String club , String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    /*public String getCompetition() {
        return this.competition;
    }
    public String getClub() {
        return this.club;
    }
    public String getPlayer() {
        return this.player;
    }*/


    /*public void setCompetition(String competition) {
        this.competition = competition;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setPlayer(String player) {
        this.player = player;
    }*/


    public String calculatePrice(String headline) {
        int finalPrice = 300;

        if(this.competition.equalsIgnoreCase("lliga de campions")) {
            finalPrice += 100;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPrice += 100;
        }
        if(this.player.equalsIgnoreCase("ferran torres") || this.player.equalsIgnoreCase("benzema")) {
            finalPrice += 50;
        }

        return "El preu de la noticia és de " + finalPrice + " €\n";
    }

    public String calculateScore(String headline) {
        int finalPunctuation = 5;

        if(this.competition.equalsIgnoreCase("lliga de campions")) {
            finalPunctuation += 3;
        } else if(this.competition.equalsIgnoreCase("lliga")) {
            finalPunctuation += 2;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPunctuation += 1;
        }
        if(this.player.equalsIgnoreCase("ferran torres") || this.player.equalsIgnoreCase("benzema")) {
            finalPunctuation += 1;
        }
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }



}
