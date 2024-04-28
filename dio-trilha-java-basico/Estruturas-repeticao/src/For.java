public class For {

    // For -> permite que uma variavel contadora seja testada e incrementada a cada iteração

    // for ( bloco de inicialização; expressao booleana de validação ; bloco de atualização ){
    //     Comando que sera executado ate que a expressao de validacao torne-se falsa
    //}
    
    // Joaozinho precisa contar ate 20 carneirinhos para dormir
    public static void main(String[] args) {
        for( int carneirinhos = 1; carneirinhos <=20; carneirinhos ++ ){
            System.out.println("Contando Carneirinhos" + carneirinhos);
        }

        System.out.println("Joaozinho Dormiu");
    }
}
