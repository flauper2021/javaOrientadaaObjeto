package br.com.javes.classes.finals;

public class CasualGamer extends Gamer{

    //@Override
    public String Keyboard(){
        return "simple keyboard...";
    }

    /*@Override
    public String mouse () {
        return super.mouse();
    }*/

    public String play(final String game) {
        //game = "WoW";
        return "Jogando "+game;

    }
}
