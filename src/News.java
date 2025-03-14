public abstract class News {


    private String headline;
    private String text;
    private int score;
    private int price;


    public News(String headline) {
        this.headline = headline;
        this.text = "";
        this.score = 0;
        this.price = 0;
    }

    public String getHeadline() {
        return this.headline;
    }

    public abstract String calculatePrice(String headline);
    public abstract String calculateScore(String headline);
    

}
