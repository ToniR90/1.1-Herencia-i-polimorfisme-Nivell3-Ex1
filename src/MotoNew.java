public class MotoNew extends New{

    private String motoTeam;

    public MotoNew(String headline , String motoTeam) {
        super(headline);
        this.motoTeam = motoTeam;
    }


    /*public String getMotoTeam() {
        return this.motoTeam;
    }


    public void setMotoTeam(String motoTeam) {
        this.motoTeam = motoTeam;
    }*/


    public String calculatePrice(String headline) {
        int finalPrice = 100;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPrice += 50;
        }
        return "El preu de la noticia és de " + finalPrice + " €\n";
    }

    public String calculateScore(String headline) {
        int finalPunctuation = 3;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPunctuation += 3;
        }
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }

}
