


public class Main {

    public static void main(String[] args) {
        
        System.out.println(divideWithoutDividing(12, 2));

    }

    public static int divideWithoutDividing(int dividend, int divider) {
        int quotient = 0;

        while (dividend > 0) {
            dividend -= divider;
            quotient++;
        }
        return quotient;
    }
}
