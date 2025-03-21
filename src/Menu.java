import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner((System.in));

    public static int userOption(){
        int option;

        System.out.println("Select an option:\n" +
                "1. Create new editor\n" +
                "2. Delete editor\n" +
                "3. Create a news article and assign it to an editor\n" +
                "4. Delete news (by editor and headline)\n" +
                "5. Show news by editor\n" +
                "6. Calculate news score\n" +
                "7. Calculate news price\n" +
                "0. Exit\n");
        option = scanner.nextInt();

        return option;
    }

    public static int newsTypeOption(){
        int option;

        System.out.println("Select the type of news\n" +
                "1. Futbol news\n" +
                "2. Basket news\n" +
                "3. Tennis news\n" +
                "4. F1 news\n" +
                "5. Moto news\n" +
                "0. Exit\n");
        option = scanner.nextInt();

        return option;
    }







}