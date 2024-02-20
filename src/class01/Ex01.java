package class01;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, result = 0;
    char op = ' ';

    System.out.println("Enter an expression: ");
    String out = sc.nextLine();

    try {
      String[] s = out.split(" ");
      a = Double.parseDouble(s[0]);
      b = Double.parseDouble(s[2]);
      op = s[1].charAt(0);

      switch (op) {
        case '+':
          result = a + b;
          break;
        case '-':
          result = a - b;
          break;
        case '*':
          result = a * b;
          break;
        case '/':
          if (b == 0) {
            System.err.println("ERR: Division by zero");
            System.exit(1);
          } else {
            result = a / b;
          }
          break;
        default:
          System.err.printf("ERR: Invalid operator '%c'\n", op);
          System.exit(1);
      }

      System.out.printf("%f %c %f = %f\n", a, op, b, result);

    } catch (Exception e) {
      System.err.println("ERR: Invalid input");
      System.exit(1);
    }
    sc.close();
  }
}
