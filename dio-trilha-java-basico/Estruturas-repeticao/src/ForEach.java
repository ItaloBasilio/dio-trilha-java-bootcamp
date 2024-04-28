public class ForEach {

    public static void main(String[] args) {
       String alunos [] = {"Joao", "Maria", "Carlos", "Joana"};

       //Forma abreviada / : A cada execução, a variavel aluno ira obter um valor
       for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
       }
    }
    
}
