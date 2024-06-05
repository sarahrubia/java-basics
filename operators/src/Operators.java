import java.util.Date;

public class Operators {
  public static void main(String[] args) throws Exception {
    // Assignment "="
    String name = "Sarah";
    int age = 30;
    double weight = 68.5;
    char gender = 'F';
    boolean organDonor = true;
    Date birthDate = new Date(1993 - 07 - 22);

    // Arithmetic
    double add = 10.5 + 15.7; // "+" can be used to concatanate strings
    int subtract = 113 - 25;
    int multiply = 20 * 7;
    int divide = 15 / 3;
    int module = 18 % 3;
    double result = (10 * 7) + (20 / 4);

    // what are the results for concatenation
    String concatenation = "?";

    concatenation = 1 + 1 + 1 + "1";
    System.out.println(concatenation);
    System.out.println("vai ser 31");

    concatenation = 1 + "1" + 1 + 1;
    System.out.println(concatenation);
    System.out.println("vai ser 112");
    System.out.println("errei, foi 1111. A partir da string, o + deixa de ser de soma e passa a ser de concatenação");

    concatenation = 1 + "1" + 1 + "1";
    System.out.println(concatenation);
    System.out.println("vai ser 1111");

    concatenation = "1" + 1 + 1 + 1;
    System.out.println(concatenation);
    System.out.println("vai ser 13");
    System.out.println("errei, foi 1111, ele converteu tudo para string");

    concatenation = "1" + (1 + 1 + 1);
    System.out.println(concatenation);
    System.out.println(
        "vai ser 13, porque os números estão sendo somados separadamente (em evidência) e só depois concatenados com a string");

    // Unary operators
    int number = 5;

    // print negative number
    System.out.println(-number);

    // increment number plus 1 , print 6
    number++;
    System.out.println(number);

    // increment number plus 1, should it print 7?
    System.out.println(number++);// not really! it printed 6!
    System.out.println(number);// now it turned 7

    // precedence is importante here:
    System.out.println(++number); // now it will print 8

    number = -5;
    // to turn a number into positive, we need to multiply by -1
    System.out.println(number); // -5
    number = number * -1;
    System.out.println(number); // 5

    boolean isTrue = true;

    System.out.println("Inverteu, agora é: " + !isTrue);

    // ternary operators
    String a = "a";
    String b = "b";
    String trueOrFalse = a == b ? "true" : "false";
    System.out.println(trueOrFalse);

    // relational operator

    int number1 = 1;
    int number2 = 2;

    if (number1 > number2)
      System.out.print("Numero 1 maior que numero 2");

    if (number1 < number2)
      System.out.print("Numero 1 menor que numero 2");

    if (number1 >= number2)
      System.out.print("Numero 1 maior ou igual que numero 2");

    if (number1 <= number2)
      System.out.print("Numero 1 menor ou igual que numero 2");

    if (number1 != number2)
      System.out.print("Numero 1 é diferente de numero 2");
  }

}
