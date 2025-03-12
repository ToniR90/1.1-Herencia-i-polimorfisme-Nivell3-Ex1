import java.util.ArrayList;

public class Editor {

    private String name;
    private final String DNI;
    private int salary;
    private ArrayList<New> news;


    public Editor(String name , String DNI) {
        this.name = name;
        this.DNI = DNI;
        this.salary = 1500;
        this.news = new ArrayList<New>();
    }


    public String getName() {
        return this.name;
    }
    public String getDni() {
        return this.DNI;
    }
    public int getSalary() {
        return this.salary;
    }
    public ArrayList<New> getNews(){
        return this.news;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setNews(New news) {
        this.news.add(news);
    }


    public String toString() {
        return "Editor: " + this.name + "\nDni: " + this.DNI + "\nSalary: " + this.salary + " €";
    }
}
