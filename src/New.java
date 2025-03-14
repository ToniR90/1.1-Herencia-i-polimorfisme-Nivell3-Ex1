public abstract class New {


    private String headline;
    private String text;
    private int score;
    private int price;


    public New(String headline) {
        this.headline = headline;
        this.text = "";
        this.score = 0;
        this.price = 0;
    }

    public String getHeadline() {
        return this.headline;
    }
    /*public String getText() {
        return this.text;
    }
    public int getPunctuation() {
        return this.punctuation;
    }
    public double getPrice() {
        return this.price;
    }*/


    /*public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setText(String text) {
        this.text = text;
    }*/



    public abstract String calculatePrice(String headline);
    public abstract String calculateScore(String headline);
    

}
