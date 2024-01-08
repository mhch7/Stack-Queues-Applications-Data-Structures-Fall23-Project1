public class BaseCounter {

  // check for wrong input
  public static void baseCounter(int b, int n) {
    if (b < 2 || b > 8 || n < 1) {
      System.out.println("invalid input");
      return;
    }

    // create a queue
    Queue<String> queue = new Queue<>();

    // loop from 1 to n and convert each number to base b
    for (int i = 1; i <= n; i++) {
      String baseBNum = BaseB(i, b);
      queue.enqueue(baseBNum);
    }

    // dequeue and print each base b
    while (!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }
  }

  // convert num to base
  private static String BaseB(int num, int base) {
    if (num == 0) {
      return "0";
    }

    String result = "";

    while (num > 0) {
      int remainder = num % base;
      result = remainder + result;
      num /= base;
    }

    return result;
  }
}