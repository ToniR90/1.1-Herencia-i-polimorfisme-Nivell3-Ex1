import java.util.Scanner;

public class Controllers {

    static Scanner scanner = new Scanner(System.in);

    public static int processOption(){

        String name;
        String dni;
        int newsOption;
        String answer = "";
        String headline;
        int option = Menu.userOption();

        do{

            switch(option){
                case 1:
                    System.out.println("Insert editor's name");
                    name = scanner.nextLine();
                    System.out.println("Insert editor's DNI");
                    dni = scanner.nextLine();
                    answer = EditorMethod.createEditor(name , dni);
                    break;
                case 2:
                    System.out.println("Insert editor's name");
                    name = scanner.nextLine();
                    System.out.println("Insert editor's DNI");
                    dni = scanner.nextLine();
                    answer = EditorMethod.deleteEditor(name , dni);
                    break;
                case 3:
                    newsOption = Menu.newsTipeOption();
                    scanner.nextLine();
                    processNewsOptions(newsOption);
                    break;
                case 4:
                    System.out.println("Insert editor's name");
                    name = scanner.nextLine();
                    System.out.println("Insert editor's DNI");
                    dni = scanner.nextLine();
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    answer = NewsMethod.deleteNews(name , dni , headline);
                    break;
                case 5:
                    System.out.println("Insert the editor's name);");
                    name = scanner.nextLine();
                    System.out.println("Insert the editor's DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.showNews(name , dni);
                    break;
                case 6:
                    System.out.println("Insert the headline of the news");
                    scanner.nextLine();
                    headline = scanner.nextLine();

                    if (NewsMethod.searchNews(headline) == -1) {
                        answer = "The news doesn't exist";
                    } else {
                        answer = Main.news.get(NewsMethod.searchNews(headline)).calculateScore(headline);
                    }
                    break;
                case 7:
                    System.out.println("Insert the headline");
                    scanner.nextLine();
                    headline = scanner.nextLine();

                    if (NewsMethod.searchNews(headline) == -1) {
                        answer = "The news doesn't exist";
                    } else {
                        answer = Main.news.get(NewsMethod.searchNews(headline)).calculatePrice(headline);
                    }
                    break;
                case 0:
                    answer = "See you again!";
                    break;
                default:
                    answer = "Select an option between 1 - 7";
            }

            System.out.println(answer);
            answer ="";
        }while(option != 0);

        return option;
    }

    public static void processNewsOptions(int newsOption){

        String headline;
        String competition;
        String club;
        String player;
        String name;
        String dni;
        String answer = "";
        String player1;
        String player2;
        String team;
        String motoTeam;

        do{
            scanner.nextLine();
            switch(newsOption){
                case 1:
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    System.out.println("Insert the competition");
                    competition = scanner.nextLine();
                    System.out.println("What club is the news about?");
                    club = scanner.nextLine();
                    System.out.println("Any famous player?");
                    player = scanner.nextLine();
                    System.out.println("Which editor will carry the news?");
                    name = scanner.nextLine();
                    System.out.println("Verify the DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.createFutbolNews(headline , competition , club , player , name , dni);
                    break;
                case 2:
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    System.out.println("Insert the competition");
                    competition = scanner.nextLine();
                    System.out.println("What club is the news about?");
                    club = scanner.nextLine();
                    System.out.println("Which editor will carry the news?");
                    name = scanner.nextLine();
                    System.out.println("Verify the DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.createBasketNews(headline , competition , club , name , dni);
                    break;
                case 3:
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    System.out.println("Insert the competition");
                    competition = scanner.nextLine();
                    System.out.println("Insert the name of the first tennis player");
                    player1 = scanner.nextLine();
                    System.out.println("Insert the name of the second tennis player");
                    player2 = scanner.nextLine();
                    System.out.println("Which editor will carry the news?");
                    name = scanner.nextLine();
                    System.out.println("Verify the DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.createTennisNews(headline , competition , player1 , player2 , name , dni);
                    break;
                case 4:
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    System.out.println("What team is running in the race?");
                    team = scanner.nextLine();
                    System.out.println("Which editor will carry the news?");
                    name = scanner.nextLine();
                    System.out.println("Verify the DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.createF1News(headline , team , name , dni);
                    break;
                case 5:
                    System.out.println("Insert the headline");
                    headline = scanner.nextLine();
                    System.out.println("What team is running in the race?");
                    motoTeam = scanner.nextLine();
                    System.out.println("Which editor will carry the news?");
                    name = scanner.nextLine();
                    System.out.println("Verify the DNI");
                    dni = scanner.nextLine();
                    answer = NewsMethod.createMotoNews(headline , motoTeam , name , dni);
                    break;
                case 0:
                    answer = "See you!";
                    break;
                default:
                    answer = "Select an option between 1 - 5";
            }

           System.out.println(answer);
            answer = "";
        }while(newsOption != 0);
    }
}
