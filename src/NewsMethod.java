public class NewsMethod {

    public static String createNews(News news , String name , String dni){
        int index = EditorMethod.searchEditor(name, dni);
        String answer;
        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            Main.news.add(news);
            Main.editors.get(index).setNews(news);
            answer = news.getClass().getName() + " created";
        }
        return answer;
    }

    public static String createFutbolNews(String headline , String competition, String club, String player,
                                            String name, String dni) {
        return createNews(new FutbolNews(headline , competition , club , player) , name , dni);
    }

    public static String createBasketNews(String headline, String competition, String club, String name,
                                             String dni) {
        return createNews(new BasketNews(headline , competition , club) , name , dni);
    }

    public static String createTennisNews(String headline, String competition, String player1,
                                           String player2, String name, String dni) {
        return createNews(new TennisNews(headline , competition , player1 , player2) , name , dni);
    }

    public static String createF1News(String headline, String team, String name, String dni) {
        return createNews(new F1News(headline , team) , name , dni);
    }

    public static String createMotoNews(String headline, String motoTeam, String name, String dni) {
       return createNews(new MotoNews(headline , motoTeam) , name , dni);
    }

    public static String deleteNews(String name, String dni , String headline) {
        String answer = "";
        int i = 0;
        boolean found = false;
        int index = EditorMethod.searchEditor(name , dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            while (i < Main.editors.get(index).getNews().size() && !found) {
                if (Main.editors.get(index).getNews().get(i).getHeadline().equalsIgnoreCase(headline)) {
                    Main.editors.get(index).getNews().remove(i);
                    found = true;
                    answer = "The news has been deleted";
                } else {
                    i++;
                    answer = "News not found";
                }
            }
        }
        return answer;
    }

    public static String showNews(String name, String dni) {
        String answer = "";
        int i = 0;
        int index = EditorMethod.searchEditor(name , dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            while (i < Main.editors.get(index).getNews().size()) {
                answer += Main.editors.get(index).getNews().get(i).getHeadline() + "\n";
                i++;
            }
        }
        return "Els titulars del redactor/a " + name + " són: \n" + answer;
    }

    public static int searchNews(String headline) {
        int index = -1;
        boolean found = false;
        int i = 0;

        while (i < Main.news.size() && !found) {

            if (Main.news.get(i).getHeadline().equalsIgnoreCase(headline)) {
                index = i;
                found = true;
            } else {
                i++;
            }
        }
        return index;
    }
}
