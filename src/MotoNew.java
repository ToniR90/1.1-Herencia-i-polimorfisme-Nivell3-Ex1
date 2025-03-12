public class MotoNew extends New{

    private String motoTeam;

    public MotoNew(String holder , String text , String motoTeam) {
        super(holder);
        this.motoTeam = motoTeam;
    }


    public String getMotoTeam() {
        return this.motoTeam;
    }


    public void setMotoTeam(String motoTeam) {
        this.motoTeam = motoTeam;
    }


    public String calculatePrice(String holder) {
        int finalPrice = 100;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPrice += 50;
        }
        return "El preu de la noticia és de " + finalPrice + " €\n";
    }

    public String calculatePunctuation(String holder) {
        int finalPunctuation = 3;

        if(this.motoTeam.equalsIgnoreCase("honda") || this.motoTeam.equalsIgnoreCase("yamaha")) {
            finalPunctuation += 3;
        }
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }
    //mètodes propis

}
