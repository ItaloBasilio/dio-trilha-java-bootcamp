public class BreakContinue {

    public static void main(String[] args) {
        
        for (int numero = 1; numero <=5; numero++) {
            if(numero == 3)
                continue; // Ao utilizar o continue, neste caso ele exclui o 3, ou seja nao imprime
                          // se fosse o break, ele iria parar no numero 2 e nao imprimir os demais

                System.out.println(numero);
        }
    }
    
}
