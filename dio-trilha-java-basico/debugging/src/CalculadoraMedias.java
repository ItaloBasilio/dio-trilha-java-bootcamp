import java.util.Scanner;

public class CalculadoraMedias {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "João"};

        int media = calculaMediaTurma(alunos, scan);
        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;

    }
    
}
