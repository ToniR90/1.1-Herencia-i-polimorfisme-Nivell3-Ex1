public class FutbolNews extends News {

    private String competition;
    private String club;
    private String player;


    public FutbolNews(String headline , String competition , String club , String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

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

        return "News price is " + finalPrice + " €\n";
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
        return "News score is " + finalPunctuation + "\n";
    }



}
