public class F1News extends News {

    private String team;


    public F1News(String headline , String team) {
        super(headline);
        this.team = team;
    }


    public String calculatePrice(String headline) {
        int finalPrice = 100;

        if(this.team.equalsIgnoreCase("ferrari") || this.team.equalsIgnoreCase("mercedes")) {
            finalPrice += 50;
        }
        return "News price is " + finalPrice + " €\n";
    }

    public String calculateScore(String headline) {
        int finalPunctuation = 4;

        if(this.team.equalsIgnoreCase("ferrari") || this.team.equalsIgnoreCase("mercedes")) {
            finalPunctuation += 2;
        }
        return "News score is " + finalPunctuation + "\n";
    }

}
