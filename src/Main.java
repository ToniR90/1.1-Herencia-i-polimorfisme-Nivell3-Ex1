import java.util.ArrayList;

public class Main {

    static ArrayList<Editor> editors = new ArrayList<Editor>();
    static ArrayList<News> news = new ArrayList<News>();

    public static void main(String[] args) {
        int mainOption;
        int subOption;
        do{
            mainOption = Menu.userOption();
            switch (mainOption){
                case 1:
                    System.out.println(Controllers.option1(mainOption));
                    break;
                case 2:
                    System.out.println(Controllers.option2(mainOption));
                    break;
                case 3:
                    do{
                        subOption = Menu.newsTypeOption();
                        switch (subOption){
                            case 1:
                                System.out.println(Controllers.futbolOption());
                                break;
                            case 2:
                                System.out.println(Controllers.basketOption());
                                break;
                            case 3:
                                System.out.println(Controllers.tennisOption());
                                break;
                            case 4:
                                System.out.println(Controllers.f1Option());
                                break;
                            case 5:
                                System.out.println(Controllers.motoOption());
                                break;
                            default:
                                System.out.println("Select an option between 1-5");
                        }
                    }while(subOption != 0);
                    break;
                case 4:
                    System.out.println(Controllers.option4(mainOption));
                    break;
                case 5:
                    System.out.println(Controllers.option5(mainOption));
                    break;
                case 6:
                    System.out.println(Controllers.option6(mainOption));
                    break;
                case 7:
                    System.out.println(Controllers.option7(mainOption));
                    break;
                case 0:
                    System.out.println("See you again!!!");
                    break;
                default:
                    System.out.println("Select an option between 1-7");

            }
        }while(mainOption != 0);
    }
}
