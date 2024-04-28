// Enquanto uma condição for valida, o bloco de codigo sera executado

// white ( Expressao booleana de validacao)
// {
//    comando que sera executado ate que a expressao torne-se falsa
// }

public class While {

    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }
    }
    
}
