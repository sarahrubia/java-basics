public class App {
  public static void main(String[] args) throws Exception {
    Account account = new Account();

    System.out.println("Saldo atual: " + account.saldo);

    account.sacar(5.20);

    System.out.println("Saldo atual: " + account.saldo);

  }
}
