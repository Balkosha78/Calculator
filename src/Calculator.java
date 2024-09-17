public class Calculator {
    double a;
    double b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double summ(int a, int b) {
        double summa = a + b;
        return summa;
    }
    public double difference (int a, int b) {
        double minus = a - b;
        return minus;
    }
    public void multiplication() {
            double multiply = a * b;
        System.out.println("Произведение а  и б  = " + multiply);
    }
    public void division() {
        double div = a / b;
        System.out.println("Частное а  и б  = " + div);
    }

}