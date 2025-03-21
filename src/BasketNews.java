public class BasketNews extends News {

    private String competition;
    private String club;


    public BasketNews(String headline , String competition , String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
    }

    public String calculatePrice(String headline) {
        int finalPrice = 250;

        if(this.competition.equalsIgnoreCase("eurolliga")) {
            finalPrice += 75;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPrice += 75;
        }
        return "News price is " + finalPrice + " €\n";
    }

    public String calculateScore(String headline) {
        int finalPunctuation = 4;

        if(this.competition.equalsIgnoreCase("eurolliga")) {
            finalPunctuation += 3;
        }else if(this.competition.equalsIgnoreCase("acb")) {
            finalPunctuation += 2;
        }
        if(this.club.equalsIgnoreCase("barça") || this.club.equalsIgnoreCase("madrid")) {
            finalPunctuation += 1;
        }
        return "News score is " + finalPunctuation + "\n";
    }

}
