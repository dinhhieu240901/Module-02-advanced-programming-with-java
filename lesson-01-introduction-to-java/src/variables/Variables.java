    package variables;

public class Variables {
    public static void main(String[] args) {
        double celsius = 35.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
    
        System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
        System.out.printf("%.1f độ C = %.1f độ F", celsius, fahrenheit);
    }
}
