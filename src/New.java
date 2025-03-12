public abstract class New {


    private String holder;
    private String text;
    private int punctuation;
    private int price;


    public New(String holder) {
        this.holder = holder;
        this.text = "";
        this.punctuation = 0;
        this.price = 0;
    }

    public String getHolder() {
        return this.holder;
    }
    public String getText() {
        return this.text;
    }
    public int getPunctuation() {
        return this.punctuation;
    }
    public double getPrice() {
        return this.price;
    }


    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void setText(String text) {
        this.text = text;
    }



    public abstract String calculatePrice(String holder);
    public abstract String calculatePunctuation(String holder);
    

}
