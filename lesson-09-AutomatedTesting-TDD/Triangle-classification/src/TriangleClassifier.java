public class TriangleClassifier {

  private static boolean isValidTriangle(double a, double b, double c) {
    return a + b > c && a + c > b && b + c > a;
  }

  public static String classify(double a, double b, double c) {
    if (a <= 0 || b <= 0 || c <= 0 || !isValidTriangle(a, b, c)) {
      throw new RuntimeException("This is not a triangle");
    } else if (a == b && b == c) {
      return "This is an equilateral triangle";
    } else if (a == b || b == c || c == a) {
      return "This is an isosceles triangle";
    } else {
      return "This is a regular triangle";
    }
  }
}
