
public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if (number >= Integer.MAX_VALUE || number <= Integer.MIN_VALUE) {
            throw new UnsupportedOperationException();
        }
        if(number < 0)
            return  -number;
        return number;
    }
}