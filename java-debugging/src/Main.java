public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciou do programa no método main.");
    a();
    System.out.println("Finalização do programa no método main.");
  }

  // Método pode conter public
  public static void a() {
    System.out.println("Entrou no método a.");
    b();
    System.out.println("Finalizou o método a.");
  }

  // Mas também pode-se omitir o public
  static void b() {
    System.out.println("Entrou no método b.");
    for (int i = 0; i <= 4; i++)
      System.out.println(i);
    c();
    System.out.println("Finalizou o método b.");
  }

  static void c() {
    System.out.println("Entrou no método c.");
    Thread.dumpStack();
    System.out.println("Finalizou o método c.");
  }

}
