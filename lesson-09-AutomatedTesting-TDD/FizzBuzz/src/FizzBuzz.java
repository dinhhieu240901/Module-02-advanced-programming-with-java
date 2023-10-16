public class FizzBuzz {

  public static String fizzBuzz(int number) {

    if (number <= 0) {
      throw new IllegalArgumentException("Invalid number");
    }
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(number);
    }
  }

  public static String convertToEnglish(int number) {
    if (number >= 0 && number < 100) {
      String numberString = Integer.toString(number);
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < numberString.length(); i++) {
        int x = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        if (x == 3 || x  == 5) {
          result.append(fizzBuzz(x));
        } else {
          result.append(convertANumberToWord(x));
        }
      }
      return result.toString();

    } else {
      throw new RuntimeException("Not a positive integer or a number greater than 100");
    }
  }



  private static String convertANumberToWord(int number) {
    String[] numberArray = new String[] {"Zero", "One", "Two", "Tree", "Four", "Five", "Six", "Seven",
            "Eight", "Nine"};
    return numberArray[number];
  }


}
