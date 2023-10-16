import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

  @org.junit.jupiter.api.Test
  void triangleClassesTest1() {
    double a = 2;
    double b = 2;
    double c = 3;
    String expected = "This is an isosceles triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void triangleClassesTest2() {
    double a = 2;
    double b = 2;
    double c = 2;
    String expected = "This is an equilateral triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void triangleClassesTest3() {
    double a = 3;
    double b = 4;
    double c = 5;
    String expected = "This is a regular triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void triangleClassesTest4() {
    double a = 8;
    double b = 2;
    double c = 3;
    String expected = "This is not a triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void triangleClassesTest5() {
    double a = -1;
    double b = 2;
    double c = 1;
    String expected = "This is not a triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void triangleClassesTest6() {
    double a = 2;
    double b = 2;
    double c = 3;
    String expected = "This is an isosceles triangle";
    String actual = TriangleClassifier.classify(a, b, c);
    assertEquals(expected, actual);
  }


}
