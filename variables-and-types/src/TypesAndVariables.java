public class TypesAndVariables {
  public static void main(String[] args) {

    // primitive types
    byte age = 123;
    short year = 2021;
    int zipCode = 21070333; // if it starts with zero, maybe it has to be of string type
    long cpf = 98765432109L; // if it starts with zero, maybe it has to be of string type
    float pi = 3.14F;
    double salary = 1275.33;

    short shortNumber = 1;
    int intNumber = shortNumber;

    // even though I can attribute shortNumber to intNumber, I can't do the reverse
    // because there is a type mismatch: cannot convert from int to short. int can be bigger than what a short value can hold

    // short shortNumber2 = intNumber; // is not possible

    // what we can do is a cast, so you force the intNumber to be of a short type
    short shortNumber2 = (short) intNumber; 

    // defining a constant
    // use the reserved word "final", the type, and write in upper case
    final double PI_VALUE = 3.14;
		
    // because it is a constant, its value cannot be reassigned
		//PI_VALUE=3.15; //this line gets error: The final local variable PI_VALUE cannot be assigned.
  }
}
