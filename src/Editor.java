import java.util.ArrayList;

public class Editor {

    private String name;
    private final String DNI;
    private static int salary = 1500;
    private ArrayList<News> news;


    public Editor(String name , String DNI) {
        this.name = name;
        this.DNI = DNI;
        this.news = new ArrayList<News>();
    }


    public String getName() {
        return this.name;
    }
    public String getDni() {
        return this.DNI;
    }
    public ArrayList<News> getNews(){
        return this.news;
    }


    public void setNews(News news) {
        this.news.add(news);
    }

}
