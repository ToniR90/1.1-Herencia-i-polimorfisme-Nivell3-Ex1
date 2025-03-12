public class BasketNew extends New{

    private String competition;
    private String club;


    public BasketNew(String holder , String text , String competition , String club) {
        super(holder);
        this.competition = competition;
        this.club = club;
    }


    public String getCompetition() {
        return this.competition;
    }
    public String getClub() {
        return this.club;
    }


    public void setCompetition(String competition) {
        this.competition = competition;
    }
    public void setClub(String club) {
        this.club = club;
    }


    public String calculatePrice(String holder) {
        int finalPrice = 250;

        if(this.competition.equalsIgnoreCase("eurolliga")) {
            finalPrice += 75;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPrice += 75;
        }
        return "El preu de la noticia és de " + finalPrice + " €\n";
    }

    public String calculatePunctuation(String holder) {
        int finalPunctuation = 4;

        if(this.competition.equalsIgnoreCase("eurolliga")) {
            finalPunctuation += 3;
        }else if(this.competition.equalsIgnoreCase("acb")) {
            finalPunctuation += 2;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPunctuation += 1;
        }
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }

}
