import java.util.Scanner;
import java.io.InputStream;

public class Main {
  public static void main(String[] args) {
    System.out.println("1) Base counter");
    System.out.println("2) Postfix calculator");

    Scanner sc = new Scanner(System.in);
    if (!sc.hasNextInt()) {
      System.err.println("Invalid choice");
      System.exit(1);
    }
    int choice = sc.nextInt();
    switch (choice) {
      case 1 -> baseCounter();
      case 2 -> postfixCalculator();
      default -> {
        System.out.println("Invalid choice");
        System.exit(1);
      }
    }
  }

  private static void baseCounter() {
    // fill this in
    // You probably should implement the algorithm in a separate class!
    // read file
    InputStream is = Main.class.getResourceAsStream("base_test.txt");
    Scanner sc = new Scanner(is);
    int base = sc.nextInt();
    int number = sc.nextInt();
    BaseCounter.baseCounter(base, number); // calls basecounter
  }

  private static void postfixCalculator() {
    // fill this in
    // You probably should implement the algorithm in a separate class!
    // read file
    InputStream is = Main.class.getResourceAsStream("postfix_test.txt");
    Scanner sc = new Scanner(is);

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      int result = PostfixCalculator.postFix(line); // calls postfix
      System.out.println(result);
    }
  }
}