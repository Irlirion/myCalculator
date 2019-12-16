public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1 + 2 = " + calculator.sum(1, 2));
        System.out.println("2 - 1 = " + calculator.minus(2, 1));
        System.out.println("10 * 2 = " + calculator.multiply(10, 2));
        System.out.println("6 / 2 = " + calculator.divide(6, 2));
    }
}
