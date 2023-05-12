package br.com.javes.classes.finals;

public class Gamer {

    public String keyboard (){
        return "Keyboard Gamer!";
    }

    public final String mouse(){
        return " Mouse Gamer!";
    }// quando o metodo tem final, não pode ser sobrescrito (@Override)


}
