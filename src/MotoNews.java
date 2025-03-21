public class MotoNews extends News {

    private String motoTeam;

    public MotoNews(String headline , String motoTeam) {
        super(headline);
        this.motoTeam = motoTeam;
    }

    public String calculatePrice(String headline) {
        int finalPrice = 100;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPrice += 50;
        }
        return "News price is " + finalPrice + " €\n";
    }

    public String calculateScore(String headline) {
        int finalPunctuation = 3;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPunctuation += 3;
        }
        return "News score is " + finalPunctuation + "\n";
    }

}
