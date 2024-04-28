public class CaixaEletronico {
    
    public static void main(String[] args) {
        
        double saldo = 29.0;
        double valorSolicitado = 28.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso! Seu novo saldo é de: R$" + saldo);
        } else {
            System.out.println("Não é possível realizar o saque. Saldo insuficiente.");
        }

    }

}
