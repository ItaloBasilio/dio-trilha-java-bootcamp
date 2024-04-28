// bloco de inicialização ; bloco booleano ;  bloco de atualização

// Em arrays, o indice inicia em zero

public class ForArrays {

    public static void main(String[] args) {
        String alunos[] = {"Joao", "Maria", "Carlos", "Joana" , "Maria Bonita", "lampiao"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x, está na posição: =" + x + " é " + alunos[x]);
        }
    }
    
}
