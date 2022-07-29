public class CondicionalTernaria {

    /**
     * @autor Mauricio
     * @param args
     */

    public static void main(String[] args) {

        int livros = 10;
        // o codigo esta usando o if/else para verificar condições, o else ifo pode ser usado quantas
        // vezes forem necessárias para verificar uma condição nas o else somente será usado ao final
        // como no exemplo
        if (livros >= 75){
            System.out.println("Quantidade em estoque no máximo");
        }else if((livros >= 35) && 75 >= livros ){
            System.out.println("Quantidade em estoque no volume médio");
        }else{
            System.out.println("Quantidade em estoque está baixo");
        }

        // outra forma de usar o if/else e a condicional ternaria, usada muito quando existe apenas duas
        // condições a serem verificadas conforme exemplo

        String estoque = ((livros >= 50) ? ("Estoque normal") : ("Estoque baixo"));
        System.out.println(estoque);

    }

}
