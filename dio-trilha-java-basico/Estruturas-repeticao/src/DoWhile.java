// Do While - Faça enquanto a condição for valida, entretanto ela testa a condição novamente, mesmo que invalida , pelo menos 1 vez
/*
 *  do
 * {
 *     comando que sera executado ate que a
 *     expressao de validação torne-se falsa
 * 
* } while ( Expressao de validação booleana)
 * 
 * 
 */

 // Joaozinho resolveu ligar para o seu amigo dizendo que se entupiu de comer doces

 import java.util.Random;

 public class DoWhile {
 
     public static void main(String[] args) {
         System.out.println("Discando...");
 
         boolean atendeu;
         do {
             atendeu = tocando();
         } while (!atendeu);
     }
 
     private static boolean tocando() {
         //atendeu , tenho o valor de 1 ha 5, e se o valor for igual a 1, ele atendeu.
         boolean atendeu = new Random().nextInt(5) == 1;
         if (atendeu) {
             System.out.println("Carlinhos : Alô, quem fala? ");
             System.out.println("Joaozinho : É o Joazinho! beleza?");
             System.out.println("Carlinhos : Fala Joãozinho? que foi?");
             System.out.println("Joaozinho : Man, comi muito doce e estou com uma dor de barriga braba!");
             System.out.println("Carlinhos : Vai trouxa, quem mandou! Agora vai ter que fazer lavagem kkkkk");
             System.out.println("Joaozinho : Para de graça, ta doendo demais");
             System.out.println("Carlinhos : kkk vacilão! Vou te zoar o ano inteiro");
         } else {
             System.out.println("Telefone Tocando...");
         }
         return atendeu;
     }
 
 }
