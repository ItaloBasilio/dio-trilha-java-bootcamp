public class CondicaoTernaria2 {

    public static void main(String[] args) {
        int nota = 5 ;
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Prova recuperação" : "Reprovado");

        System.out.println(resultado);
    }
    
}

