package br.com.javes.classes.abstrata;

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String desenha (int x, int y){
        return "Desenhando nas coordenadas x= "+x+", y= "+y;

    }

}
