public class OperadoresComparativos {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 2;
        boolean resultado;

        resultado = a > b; // resultado recebe false porque 'a' não é maior que 'b';
        resultado = a < b; // resultado recebe true porque 'a' é menor que 'b';
        resultado = a == b; // resultado recebe false porque 'a' não é igual a 'b';
        resultado = b == c; // resultado recebe true porque 'b' é igual a 'c';
        resultado = a >= b; // resultado recebe false porque 'a' não é maior ou igual de 'b';
        resultado = a <= b; // resultado recebe true porque 'a' é menor ou igual a 'b';
        resultado = a != b; // resultado recebe true porque 'a' é diferente de 'b';
        resultado = b != c; // resultado recebe false porque 'b' não é diferente de 'c';

    }

}
