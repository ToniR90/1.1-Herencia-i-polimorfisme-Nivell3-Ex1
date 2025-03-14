public class EditorMethod {

    public static String createEditor(String name, String dni) {
        int i = 0;
        String answer = "";
        int control = 0;
        boolean found = false;

        while (i < Main.editors.size() && !found) {
            if (Main.editors.get(i).getDni().equalsIgnoreCase(dni)) {
                found = true;
                control++;
                answer = "DNI already exist, try again";
            } else {
                i++;
            }
        }
        if (control == 0) {
            Editor newEditor = new Editor(name, dni);
            Main.editors.add(newEditor);
            answer = "The editor has been created";
        }
        return answer;
    }


    public static int searchEditor(String name, String dni) {
        int index = -1;
        int i = 0;
        boolean found = false;

        while (i < Main.editors.size() && !found) {
            if (Main.editors.get(i).getName().equalsIgnoreCase(name) &&
                    Main.editors.get(i).getDni().equalsIgnoreCase(dni)) {
                index = i;
                found = true;
            } else {
                i++;
            }
        }
        return index;
    }


    public static String deleteEditor(String name, String dni) {
        String answer = "";
        int index = searchEditor(name, dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            Main.editors.remove(index);
            answer = "The profile has been deleted";
        }
        return answer;
    }


}
