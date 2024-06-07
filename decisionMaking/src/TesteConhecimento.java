import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TesteConhecimento {
  public static void main(String[] args) {
    // for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
    // System.out.println(carneirinhos + " - Carneirinho(s)");
    // }

    // String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    // for (int x = 0; x < alunos.length; x++) {
    // System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    // }

    // String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    // // Forma abreviada
    // for (String aluno : alunos) {
    // System.out.println(aluno);
    // }

    // for (int numero = 1; numero <= 5; numero++) {
    // if (numero == 3)
    // continue;

    // System.out.println(numero);
    // }

    // double mesada = 0;
    // while (mesada > 0) {
    // Double valorDoce = valorAleatorio();
    // if (valorDoce > mesada)
    // valorDoce = mesada;

    // System.out.println("Valor do doce: " + valorDoce + " Adicionado no
    // carrinho");
    // mesada = mesada - valorDoce;
    // }
    // System.out.println("Mesada:" + mesada);
    // System.out.println("Joãozinho gastou toda a sua mesada em doces");

    // /*
    // * Não se preocupe quanto a formatação de valores
    // * Iremos explorar os recursos de formatação em breve !!
    // */
    // }

    // private static double valorAleatorio() {
    // return ThreadLocalRandom.current().nextDouble(2, 8);
    // }

    // System.out.println("Discando...");

    // do {
    // // excutando repetidas vezes até alguém atender
    // System.out.println("Telefone tocando");

    // } while (tocando());

    // System.out.println("Alô !!!");
    // }

    // private static boolean tocando() {
    // boolean atendeu = new Random().nextInt(5) == 1;
    // System.out.println("Atendeu? " + atendeu);
    // // negando o ato de continuar tocando
    // return !atendeu;
    // }

    String[] nomes = { "Camila", "Venilton", "Leonardo", "Renan", "Rafael" };
    System.out.print(nomes.length);
  }
}
