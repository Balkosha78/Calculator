public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);
        double summa = calculator.summ(2, 5);
        double minus = calculator.difference(2, 5);
        System.out.println("Сумма а и б = " + summa);
        System.out.println("Разность а и б = " + minus);
        calculator.multiplication();
        calculator.division();
    }
}
