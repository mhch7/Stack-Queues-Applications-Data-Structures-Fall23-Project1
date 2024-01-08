public class PostfixCalculator {

  //check if string represnts number
  private static boolean isNum (String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  //postfix calc math
 private static int Operation(String operator, int one, int two) {
    switch (operator) {
        case "+":
            return one + two;
        case "-":
            return one - two;
        case "x":
        case "*":
            return one * two;
        case "/":
            if (two != 0) {
                return one / two;
            } else {
            throw new IllegalArgumentException("cant divide 0");
            }
        default:
            throw new IllegalArgumentException("invalid operator: " + operator);
    }
}

//evaluate postfix and return result
 public static int postFix(String postfix) {
    Stack<Integer> stack = new Stack<>();
    String[] numbers = postfix.split(" ");

    for (String number : numbers) {
        if (isNum(number)) {
            stack.push(Integer.parseInt(number));
        } else {
            int two = stack.pop();
            int one = stack.pop();
            int result = Operation(number, one, two);
            stack.push(result);
        }
    }

    return stack.pop();
}

}
