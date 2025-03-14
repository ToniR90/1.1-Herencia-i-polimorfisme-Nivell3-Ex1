public class EditorMethod {

    public static String createEditor(String name, String dni) {
        String answer = "";

        if(searchEditor(dni) != -1){
            answer = "DNI already exists, try again";
        }else{
            Editor newEditor = new Editor(name , dni);
            Main.editors.add(newEditor);
            answer = "The editor has been created";
        }
        return answer;
    }


    public static int searchEditor(String dni) {
        int index = -1;

        for (int i = 0 ; i < Main.editors.size() ; i++){
            if(Main.editors.get(i).getDni().equalsIgnoreCase(dni)){
                index = i;
            }
        }
        return index;
    }


    public static String deleteEditor(String dni) {
        String answer = "";
        int index = searchEditor(dni);

        if (index == -1) {
            answer = "The profile doesn't exist in the database";
        } else {
            Main.editors.remove(index);
            answer = "The profile has been deleted";
        }
        return answer;
    }


}
