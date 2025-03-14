import java.util.ArrayList;

public class Main {


        static ArrayList<Editor> editors = new ArrayList<Editor>();
        static ArrayList<News> news = new ArrayList<News>();

        public static void main(String[] args) {
            System.out.println("Welcome to the News Management System!");
            Menu.startMenu();
            System.out.println("Thank you for using the system. Goodbye!");
        }


            /*int opcio = 0;
            int opcio2 = 0;
            String resposta = "";
            String resposta2 = "";
            String nom = "";
            String dni = "";
            String titular = "";
            String text = "";
            String competicio = "";
            String club = "";
            String jugador = "";
            String tenista1 = "";
            String tenista2 = "";
            String escuderia = "";
            String equip = "";
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Tria una opció del menú:\n" + "1. Introduir redactor/a\n" + "2. Eliminar redactor/a\n"
                        + "3. Introduir noticia a un redactor/a\n" + "4. Eliminar noticia\n"
                        + "5. Mostra totes les notícies per redactor/a\n" + "6. Calcular puntuació de la notícia\n"
                        + "7. Calcular preu de la notícia\n" + "0. Sortir\n");
                opcio = scanner.nextInt();

                switch (opcio) {
                    case 1:
                        System.out.println("Introdueix el nom del redactor/a");
                        nom = scanner.next();
                        System.out.println("Introdueix el DNI");
                        dni = scanner.next();
                        System.out.println(crearRedactor(nom, dni));
                        break;

                    case 2:
                        System.out.println("Introdueix el nom del redactor/a");
                        nom = scanner.next();
                        System.out.println("Introdueix el DNI");
                        dni = scanner.next();
                        System.out.println(eliminarRedactor(nom, dni));
                        break;

                    case 3:
                        do {
                            System.out.println("Selecciona el tipus de noticia:\n" + "1. Futbol\n" + "2. Bàsquet\n"
                                    + "3. Tenis\n" + "4. Fórmula 1\n" + "5. Motociclisme\n" + "0. Sortir");
                            opcio2 = scanner.nextInt();

                            switch (opcio2) {
                                case 1:
                                    System.out.println("Introdueix el titular de la noticia");
                                    scanner.nextLine(); // neteja de buffer
                                    titular = scanner.nextLine();
                                    System.out.println("Introdueix el text de la notícia");
                                    text = scanner.nextLine();
                                    System.out.println("A quina competició fa referència?");
                                    competicio = scanner.nextLine();
                                    System.out.println("De quin club es parla?");
                                    club = scanner.nextLine();
                                    System.out.println("I de quin jugador?");
                                    jugador = scanner.nextLine();
                                    System.out.println("Quin redactor portarà la noticia? Introdueix el nom");
                                    nom = scanner.next();
                                    System.out.println("Introdueix el seu DNI");
                                    dni = scanner.next();
                                    System.out.println(crearNoticiaFutbol(titular, text, competicio, club, jugador, nom, dni));
                                    break;

                                case 2:
                                    System.out.println("Introdueix el titular de la noticia");
                                    scanner.nextLine(); // neteja de buffer
                                    titular = scanner.nextLine();
                                    System.out.println("Introdueix el text de la notícia");
                                    text = scanner.nextLine();
                                    System.out.println("A quina competició fa referència?");
                                    competicio = scanner.nextLine();
                                    System.out.println("De quin club es parla?");
                                    club = scanner.nextLine();
                                    System.out.println("Quin redactor portarà la noticia? Introdueix el nom");
                                    nom = scanner.next();
                                    System.out.println("Introdueix el seu DNI");
                                    dni = scanner.next();
                                    System.out.println(crearNoticiaBasquet(titular, text, competicio, club, nom, dni));
                                    break;

                                case 3:
                                    System.out.println("Introdueix el titular de la noticia");
                                    scanner.nextLine(); // neteja de buffer
                                    titular = scanner.nextLine();
                                    System.out.println("Introdueix el text de la notícia");
                                    text = scanner.nextLine();
                                    System.out.println("A quina competició fa referència?");
                                    competicio = scanner.nextLine();
                                    System.out.println("Quin és el nom del primer tenista?");
                                    tenista1 = scanner.next();
                                    System.out.println("Quin és el nom del segon tenista?");
                                    tenista2 = scanner.next();
                                    System.out.println("Quin redactor portarà la noticia? Introdueix el nom");
                                    nom = scanner.next();
                                    System.out.println("Introdueix el seu DNI");
                                    dni = scanner.next();
                                    System.out.println(crearNoticiaTenis(titular, text, competicio, tenista1, tenista2, nom, dni));
                                    break;

                                case 4:
                                    System.out.println("Introdueix el titular de la noticia");
                                    scanner.nextLine(); // neteja de buffer
                                    titular = scanner.nextLine();
                                    System.out.println("Introdueix el text de la notícia");
                                    text = scanner.nextLine();
                                    System.out.println("De quina escuderia es parla?");
                                    escuderia = scanner.next();
                                    System.out.println("Quin redactor portarà la noticia? Introdueix el nom");
                                    nom = scanner.next();
                                    System.out.println("Introdueix el seu DNI");
                                    dni = scanner.next();
                                    System.out.println(crearNoticiaF1(titular, text, escuderia, nom, dni));
                                    break;

                                case 5:
                                    System.out.println("Introdueix el titular de la noticia");
                                    scanner.nextLine(); // neteja de buffer
                                    titular = scanner.nextLine();
                                    System.out.println("Introdueix el text de la notícia");
                                    text = scanner.nextLine();
                                    System.out.println("De quin equip es parla?");
                                    equip = scanner.next();
                                    System.out.println("Quin redactor portarà la noticia? Introdueix el nom");
                                    nom = scanner.next();
                                    System.out.println("Introdueix el seu DNI");
                                    dni = scanner.next();
                                    System.out.println(crearNoticiaMoto(titular, text, equip, nom, dni));
                                    break;

                                default:
                                    resposta2 = "Selecciona una opció vàlida";
                            }

                            System.out.println(resposta2);
                            resposta2 = "";

                        } while (opcio2 != 0);
                        break;

                    case 4:
                        System.out.println("Introdueix el nom del redactor que porta la noticia");
                        nom = scanner.next();
                        System.out.println("Introdueix el DNI");
                        dni = scanner.next();
                        System.out.println("Introdueix el titular de la noticia");
                        titular = scanner.next();
                        System.out.println(eliminarNoticia(nom, dni, titular));
                        break;

                    case 5:
                        System.out.println("Introdueix el nom del redactor");
                        nom = scanner.next();
                        System.out.println("Introdueix el DNI");
                        dni = scanner.next();
                        System.out.println(mostrarNoticia(nom, dni));
                        break;

                    case 6:
                        System.out.println("Introdueix el titular de la noticia");
                        scanner.nextLine();
                        titular = scanner.nextLine();

                        if (buscarNoticia(titular) == -1) {
                            resposta = "La noticia no existeix";
                        } else {
                            System.out.println(news.get(buscarNoticia(titular)).calculatePunctuation(titular));
                        }
                        break;

                    case 7:
                        System.out.println("Introdueix el titular de la noticia");
                        scanner.nextLine();
                        titular = scanner.nextLine();

                        if (buscarNoticia(titular) == -1) {
                            resposta = "La noticia no existeix";
                        } else {
                            System.out.println(news.get(buscarNoticia(titular)).calculatePrice(titular));
                        }
                        break;

                    case 0:
                        resposta = "Fins aviat!";
                        break;
                    default:
                        resposta = "Tria una opció vàlida";
                }

                System.out.println(resposta);
                resposta = "";

            } while (opcio != 0);
            scanner.close();*/
       // }

        // mètodes personalitzats

        /*public static String crearRedactor(String nom, String dni) { // creació de redactors
            int i = 0;
            String resposta = "";
            int varControl = 0;
            boolean trobat = false;

            while (i < editors.size() && !trobat) {
                if (editors.get(i).getDni().equalsIgnoreCase(dni)) {
                    trobat = true;
                    varControl++;
                    resposta = "El DNI ja existeix a la base de dades, no es pot crear el perfil";
                } else {
                    i++;
                }
            }
            if (varControl == 0) {
                Editor newEditor = new Editor(nom, dni);
                editors.add(newEditor);
                resposta = "Redactor/a creat correctament";
            }
            return resposta;
        }*/

        /*public static int buscarRedactor(String nom, String dni) { // mètode per buscar redactors
            int posicioArray = -1;
            int i = 0;
            boolean trobat = false;

            while (i < editors.size() && !trobat) {
                if (editors.get(i).getName().equalsIgnoreCase(nom) && editors.get(i).getDni().equalsIgnoreCase(dni)) {
                    posicioArray = i;
                    trobat = true;
                } else {
                    i++;
                }
            }
            return posicioArray;
        }*/

        /*public static String eliminarRedactor(String nom, String dni) { // mètode per eliminar redactors
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El perfil introduït no existeix a la base de dades";
            } else {
                editors.remove(posicioArray);
                resposta = "El perfil s'ha esborrat correctament";
            }
            return resposta;
        }*/

        /*public static String eliminarNoticia(String nom, String dni, String titular) { // mètode per eliminar noticies
            String resposta = "";
            int i = 0;
            boolean trobat = false;
            int posicioArray = buscarRedactor(nom, dni);
            titular = titular.toLowerCase();

            if (posicioArray == -1) {
                resposta = "El perfil introduït no existeix a la base de dades";
            } else {
                while (i < editors.get(posicioArray).getNews().size() && !trobat) {
                    editors.get(posicioArray).getNews().get(i).getHolder().toLowerCase();
                    if (editors.get(posicioArray).getNews().get(i).getHolder().contains(titular)) {
                        editors.get(posicioArray).getNews().remove(i);
                        trobat = true;
                        resposta = "Noticia eliminada";
                    } else {
                        i++;
                        resposta = "Noticia no trobada";
                    }
                }
            }
            return resposta;
        }*/

        /*public static String mostrarNoticia(String nom, String dni) { // mètode per mostrar noticies
            String resposta = "";
            int i = 0;
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El perfil introduït no existeix a la base de dades";
            } else {
                while (i < editors.get(posicioArray).getNews().size()) {
                    resposta += editors.get(posicioArray).getNews().get(i).getHolder() + "\n";
                    i++;
                }
            }
            return "Els titulars del redactor/a " + nom + " són: \n" + resposta;
        }*/

        /*public static int buscarNoticia(String titular) { // mètode per buscar noticies
            int posicioArrayNoticia = -1;
            boolean trobat = false;
            int i = 0;
            titular = titular.toLowerCase();

            while (i < news.size() && !trobat) {
                news.get(i).getHolder().toLowerCase();
                if (news.get(i).getHolder().contains(titular)) {
                    posicioArrayNoticia = i;
                    trobat = true;
                } else {
                    i++;
                }
            }
            return posicioArrayNoticia;
        }*/

        // mètodes per crear objectes noticia

        /*public static String crearNoticiaFutbol(String titular, String text, String competicio, String club, String jugador,
                                                String nom, String dni) {
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El redactor no existeix a la base de dades";
            } else {
                FutbolNew newFutbolNew = new FutbolNew(titular, text, competicio, club, jugador);
                news.add(newFutbolNew);
                editors.get(posicioArray).setNews(newFutbolNew);
                resposta = "Noticia afegida";
            }

            return resposta;
        }*/

        /*public static String crearNoticiaBasquet(String titular, String text, String competicio, String club, String nom,
                                                 String dni) {
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El redactor no existeix a la base de dades";
            } else {
                BasketNew newBasketNew = new BasketNew(titular, text, competicio, club);
                news.add(newBasketNew);
                editors.get(posicioArray).setNews(newBasketNew);
                resposta = "Noticia afegida";
            }

            return resposta;
        }*/

        /*public static String crearNoticiaTenis(String titular, String text, String competicio, String tenista1,
                                               String tenista2, String nom, String dni) {
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El redactor no existeix a la base de dades";
            } else {
                TennisNew newTennisNew = new TennisNew(titular, text, competicio, tenista1, tenista2);
                news.add(newTennisNew);
                editors.get(posicioArray).setNews(newTennisNew);
                resposta = "Noticia afegida";
            }

            return resposta;
        }*/

        /*public static String crearNoticiaF1(String titular, String text, String escuderia, String nom, String dni) {
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El redactor no existeix a la base de dades";
            } else {
                F1New newF1New = new F1New(titular, text, escuderia);
                news.add(newF1New);
                editors.get(posicioArray).setNews(newF1New);
                resposta = "Noticia afegida";
            }

            return resposta;
        }*/

        /*public static String crearNoticiaMoto(String titular, String text, String equip, String nom, String dni) {
            String resposta = "";
            int posicioArray = buscarRedactor(nom, dni);

            if (posicioArray == -1) {
                resposta = "El redactor no existeix a la base de dades";
            } else {
                MotoNew newMotoNew = new MotoNew(titular, text, equip);
                news.add(newMotoNew);
                editors.get(posicioArray).setNews(newMotoNew);
                resposta = "Noticia afegida";
            }

            return resposta;
        }*/

    }
