public class F1New extends New{

    private String team;


    public F1New(String holder , String text , String team) {
        super(holder);
        this.team = team;
    }


    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    public String calculatePrice(String holder) {
        int finalPrice = 100;

        if(this.team.equalsIgnoreCase("ferrari") || this.team.equalsIgnoreCase("mercedes")) {
            finalPrice += 50;
        }
        return "El preu de la noticia és de " + finalPrice + " €\n";
    }

    public String calculatePunctuation(String holder) {
        int finalPunctuation = 4;

        if(this.team.equalsIgnoreCase("ferrari") || this.team.equalsIgnoreCase("mercedes")) {
            finalPunctuation += 2;
        }
        return "La puntuació de la noticia és de " + finalPunctuation + " punts\n";
    }
    //mètodes propis

}
