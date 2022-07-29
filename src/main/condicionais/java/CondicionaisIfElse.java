public class CondicionaisIfElse {

    public static void main(String[] args) {

        /*if(condição) {  -a condição tem que ser um valor booleano
            codigo - se verdadeira a condição o codigo é executado
        } else {
            //código - se a condição de if é falsa o codigo do else é executado
        }*/

        //exemplo
        int a =2, b = 3, resultado;

        if(a > b){
            resultado = a + b; // se a expressão 'if' for verdadeira os valores serão somados
        }else{
            resultado = a * b; // se a expressão de 'if' for falsa os valores serão multiplicados
        }

    }

}