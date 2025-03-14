public class NewsMethod {

    public static String createFutbolNews(String headline , String competition, String club, String player,
                                            String name, String dni) {
        String answer;
        int index = EditorMethod.searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            FutbolNew newFutbolNew = new FutbolNew(headline, competition, club, player);
            Main.news.add(newFutbolNew);
            Main.editors.get(index).setNews(newFutbolNew);
            answer = "Futbol news created";
        }

        return answer;
    }

    public static String createBasketNews(String headline, String competition, String club, String name,
                                             String dni) {
        String answer = "";
        int index = EditorMethod.searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            BasketNew newBasketNew = new BasketNew(headline, competition, club);
            Main.news.add(newBasketNew);
            Main.editors.get(index).setNews(newBasketNew);
            answer = "Basket news created";
        }

        return answer;
    }

    public static String createTennisNews(String headline, String competition, String player1,
                                           String player2, String name, String dni) {
        String answer = "";
        int index = EditorMethod.searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            TennisNew newTennisNew = new TennisNew(headline , competition, player1, player2);
            Main.news.add(newTennisNew);
            Main.editors.get(index).setNews(newTennisNew);
            answer = "Tennis news created";
        }

        return answer;
    }

    public static String createF1News(String headline, String team, String name, String dni) {
        String answer = "";
        int index = EditorMethod.searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            F1New newF1New = new F1New(headline, team);
            Main.news.add(newF1New);
            Main.editors.get(index).setNews(newF1New);
            answer = "F1 news created";
        }

        return answer;
    }

    public static String createMotoNews(String headline, String motoTeam, String name, String dni) {
        String answer = "";
        int index = EditorMethod.searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            MotoNew newMotoNew = new MotoNew(headline, motoTeam);
            Main.news.add(newMotoNew);
            Main.editors.get(index).setNews(newMotoNew);
            answer = "Moto news created";
        }

        return answer;
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
