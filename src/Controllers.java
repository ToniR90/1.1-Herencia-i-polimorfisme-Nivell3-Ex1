import java.util.Scanner;

public class Controllers {

    static Scanner scanner = new Scanner(System.in);

    public static String option1 (int option){
        System.out.println("Insert editor's name");
        String name = scanner.nextLine();
        System.out.println("Insert editor's DNI");
        String dni = scanner.nextLine();
        return EditorMethod.createEditor(name , dni);
    }

    public static String option2 (int option){
        System.out.println("Insert editor's name");
        String name = scanner.nextLine();
        System.out.println("Insert editor's DNI");
        String dni = scanner.nextLine();
        return EditorMethod.deleteEditor(dni);
    }

    public static String option4(int option){
        System.out.println("Insert editor's name");
        String name = scanner.nextLine();
        System.out.println("Insert editor's DNI");
        String dni = scanner.nextLine();
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        return NewsMethod.deleteNews(name , dni , headline);
    }

    public static String option5(int option){
        System.out.println("Insert the editor's name);");
        String name = scanner.nextLine();
        System.out.println("Insert the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.showNews(name , dni);
    }

    public static String option6(int option){
        String answer;
        System.out.println("Insert the headline of the news");
        scanner.nextLine();
        String headline = scanner.nextLine();

        if (NewsMethod.searchNews(headline) == -1) {
            answer = "The news doesn't exist";
        } else {
            answer = Main.news.get(NewsMethod.searchNews(headline)).calculateScore(headline);
        }
        return answer;
    }

    public static String option7(int option){
        String answer;
        System.out.println("Insert the headline");
        scanner.nextLine();
        String headline = scanner.nextLine();

        if (NewsMethod.searchNews(headline) == -1) {
            answer = "The news doesn't exist";
        } else {
            answer = Main.news.get(NewsMethod.searchNews(headline)).calculatePrice(headline);
        }
        return answer;
    }



    public static String futbolOption(){
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        System.out.println("Insert the competition");
        String competition = scanner.nextLine();
        System.out.println("What club is the news about?");
        String club = scanner.nextLine();
        System.out.println("Any famous player?");
        String player = scanner.nextLine();
        System.out.println("Verify the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.createFutbolNews(headline , competition , club , player , dni);
    }

    public static String basketOption(){
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        System.out.println("Insert the competition");
        String competition = scanner.nextLine();
        System.out.println("What club is the news about?");
        String club = scanner.nextLine();
        System.out.println("Verify the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.createBasketNews(headline , competition , club , dni);
    }

    public static String tennisOption(){
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        System.out.println("Insert the competition");
        String competition = scanner.nextLine();
        System.out.println("Insert the name of the first tennis player");
        String player1 = scanner.nextLine();
        System.out.println("Insert the name of the second tennis player");
        String player2 = scanner.nextLine();
        System.out.println("Verify the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.createTennisNews(headline , competition , player1 , player2 , dni);
    }

    public static String f1Option(){
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        System.out.println("What team is running in the race?");
        String team = scanner.nextLine();
        System.out.println("Verify the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.createF1News(headline , team , dni);
    }

    public static String motoOption(){
        System.out.println("Insert the headline");
        String headline = scanner.nextLine();
        System.out.println("What team is running in the race?");
        String motoTeam = scanner.nextLine();
        System.out.println("Verify the editor's DNI");
        String dni = scanner.nextLine();
        return NewsMethod.createMotoNews(headline , motoTeam , dni);
    }
}
